package com.euromsgexpress.Pages;

import com.euromsgexpress.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMemberPage extends BasePage{

    public AddMemberPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//span[@class='fa fa-check']")
    public WebElement permission;

    @FindBy(xpath = "//button[@class='btn btn-labeled btn-success']")
    public WebElement saveButton2;

    @FindBy(css = ".table-responsive.ng-star-inserted table tbody tr td:nth-of-type(2)")
    public WebElement registeredName;

    @FindBy(css = ".table-responsive.ng-star-inserted table tbody tr td:nth-of-type(3)")
    public WebElement registeredSurName;

    @FindBy(css = ".table-responsive.ng-star-inserted table tbody tr td:nth-of-type(1)")
    public WebElement registeredEmail;
}
