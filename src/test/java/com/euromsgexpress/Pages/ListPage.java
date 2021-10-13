package com.euromsgexpress.Pages;

import com.euromsgexpress.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ListPage extends BasePage {
    public ListPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@class='btn btn-labeled btn-purple']")
    public WebElement createNewList;

    @FindBy(css = "[placeholder='Listeye isim ver']")
    public WebElement listName;

    @FindBy(xpath = "//button[@class='btn btn-labeled btn-success ng-star-inserted']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[contains(.,'Üye Ekle')]")
    public WebElement addNewMember;

    @FindBy(xpath = "//a[.='Form ile Ekle']")
    public WebElement addForm;
}
