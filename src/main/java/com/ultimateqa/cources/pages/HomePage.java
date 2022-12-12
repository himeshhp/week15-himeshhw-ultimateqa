package com.ultimateqa.cources.pages;

import com.ultimateqa.cources.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInLink;

    public void clickOnSignInLink() {
        Reporter.log("Clicked on signin link " + signInLink.toString());
        clickOnElement(signInLink);
    }
}
