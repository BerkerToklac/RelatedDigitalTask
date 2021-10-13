package com.euromsgexpress.step_definitions;

import com.euromsgexpress.Pages.AddMemberPage;
import com.euromsgexpress.Pages.HomePage;
import com.euromsgexpress.Pages.ListPage;
import com.euromsgexpress.Pages.LoginPage;
import com.euromsgexpress.utilities.BrowserUtils;
import com.euromsgexpress.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Membership_defs {
    //

    Faker faker = new Faker();
    //
    HomePage homePage = new HomePage();
    ListPage listPage = new ListPage();
    LoginPage loginPage = new LoginPage();
    AddMemberPage addmemberPage = new AddMemberPage();

    @When("Click Üyelerini Ekle bar")
    public void clickÜyeleriniEkleBar() {
        BrowserUtils.waitForClickablility(homePage.addToYourMembers,8);
        homePage.addToYourMembers.click();
    }

    @And("Click Yeni Liste Oluştur bar")
    public void clickYeniListeOluşturBar() {
        BrowserUtils.waitForClickablility(listPage.createNewList,8);
        listPage.createNewList.click();
    }

    String list;
    @And("Name the list")
    public void nameTheList() {

        list = faker.company().name();
        listPage.listName.sendKeys(list);
        listPage.saveButton.click();
    }

    String expectedName;
    String expectedSurname;
    String expectedEmail;
    @And("Add new member using add with form")
    public void addNewMemberUsingAddWithForm() {
        listPage.addNewMember.click();
        listPage.addForm.click();
        expectedName = faker.name().firstName();
        expectedSurname = faker.name().lastName();
        expectedEmail = expectedName.toLowerCase() + "." + expectedSurname.toLowerCase() + "@hotmail.com";
        addmemberPage.firstName.sendKeys(expectedName);
        addmemberPage.lastName.sendKeys(expectedSurname);
        addmemberPage.email.sendKeys(expectedEmail);
        addmemberPage.permission.click();
        addmemberPage.saveButton2.click();
    }


    String actualName;
    String actualSurname;
    String actualEmail;
    @Then("Verify that new member is seen under recordeds tab")
    public void verifyThatNewMemberIsSeenUnderRecordedsTab() {
        actualName = addmemberPage.registeredName.getText();
        actualSurname = addmemberPage.registeredSurName.getText();
        actualEmail = addmemberPage.registeredEmail.getText();
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedSurname,actualSurname);
        Assert.assertEquals(expectedEmail,actualEmail);
    }

    @When("Send valid {string} and {string}")
    public void sendValidAnd(String email, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);
    }
}
