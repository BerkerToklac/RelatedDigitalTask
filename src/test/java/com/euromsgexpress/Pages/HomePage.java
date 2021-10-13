package com.euromsgexpress.Pages;

import com.euromsgexpress.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//h4[.='Üyelerini Ekle']")
    public WebElement addToYourMembers;
}
