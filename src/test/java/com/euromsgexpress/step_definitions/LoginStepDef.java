package com.euromsgexpress.step_definitions;

import com.euromsgexpress.Pages.DashboardPage;
import com.euromsgexpress.Pages.HomePage;
import com.euromsgexpress.Pages.LoginPage;
import com.euromsgexpress.utilities.BrowserUtils;
import com.euromsgexpress.utilities.ConfigurationReader;
import com.euromsgexpress.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("Navigate to home page")
    public void navigate_to_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(loginPage.entryButton,8);
        loginPage.entryButton.click();
        BrowserUtils.waitForClickablility(loginPage.emailBox,8);
    }

    @When("Enter valid {string} and {string}")
    public void enter_valid_and(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);
}

    @When("Proceed to captcha and click login button")
    public void proceed_to_captcha_and_click_login_button() throws InterruptedException {
        Thread.sleep(60000);
        loginPage.loginButton.click();

    }

    @Then("Verify that user is on the home page")
    public void verify_that_user_is_on_the_home_page() {
        BrowserUtils.waitForClickablility(homePage.addToYourMembers,8);
        String expectedUrl = "https://console.euromsg.com/home";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("PASS");
    }

    @When("Enter invalid {string} and {string}")
    public void enter_invalid_and(String email, String password) {

        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);
    }

    @Then("Verify that user can not login")
    public void verify_that_user_can_not_login() throws InterruptedException {
        Thread.sleep(3000);
        String homePageUrl = "https://console.euromsg.com/home";
        Assert.assertFalse(Driver.get().getCurrentUrl(), equals(homePageUrl));
    }

    @When("Click the {string} field and leave it blank")
    public void click_the_field_and_leave_it_blank(String email) {
        loginPage.emailBox.sendKeys(email);
    }

    @When("Enter the {string} empty field")
    public void enter_the_empty_field(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @Then("Verify that warning is seen under email tab")
    public void verify_that_warning_is_seen_under_email_tab() {
        String expectedExpression = "This field is required.";
        String actualExpression = loginPage.emailBoxWarning.getText();
        Assert.assertEquals(expectedExpression,actualExpression);
    }

    @When("Sends a space String to the {string} button")
    public void sends_a_space_String_to_the_button(String password) {
        loginPage.passwordBox.sendKeys(password);
    }


    @Then("Verify that warning is seen under password tab")
    public void verify_that_warning_is_seen_under_password_tab() {
        String expectedExpression = "This field is required.";
        String actualExpression = loginPage.passwordBoxWarning.getText();
        Assert.assertEquals(expectedExpression,actualExpression);
    }

    @When("Click ForgetMyPassword bar")
    public void click_ForgetMyPassword_bar() {
        loginPage.forgotPasswordButton.click();
    }

    @When("Send a valid email as {string} and verify captcha step")
    public void send_a_valid_email_as_and_verify_captcha_step(String email) throws InterruptedException {
        loginPage.emailBoxForNewPassword.sendKeys(email);
        Thread.sleep(40000);
    }

    @When("Click send button")
    public void click_send_button() {
        loginPage.sendButton.click();
    }


    @And("Enter the {string} field")
    public void enterTheField(String email) {
        loginPage.emailBox.sendKeys(email);
    }

    @Then("Verify that email is successfully sent")
    public void verifyThatEmailIsSuccessfullySent() {
        String expectedText = "The necessary information to reset your password has been successfully sent to your e-mail address.";
        String actualText = loginPage.resetMessageVerification.getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
