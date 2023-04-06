package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class lmsloginpage extends TestBase {

    @FindBy(xpath = "//input[@name=\"user_login_id\"]")
    WebElement userid;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//input[@value=\"Sign In\"]")
    WebElement loginbutton;
    @FindBy(xpath = "//*[contains(text(),' LMS')]")
    WebElement Islandingpage;


    public void inputUserID(String loginid) {
        userid.sendKeys(loginid);

    }

    public void inputpwd(String loginpwd) {
        password.sendKeys(loginpwd);

    }

    public void clickloginbButton() {
        loginbutton.click();
    }

    public Boolean landingpage(){
      return  Islandingpage.isDisplayed();
    }

}
