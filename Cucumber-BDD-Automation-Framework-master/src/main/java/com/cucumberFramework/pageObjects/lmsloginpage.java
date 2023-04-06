package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;


import org.openqa.selenium.*;
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
//        userid.sendKeys(loginid);
        driver.findElement(By.xpath("//input[@name=\"user_login_id\"]")).sendKeys(loginid);

    }

    public void inputpwd(String loginpwd) {
//        password.sendKeys(loginpwd);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(loginpwd);

    }

    public void clickloginbButton() {
//        loginbutton.click();
        driver.findElement(By.xpath("//input[@value=\"Sign In\"]")).click();
    }

    public Boolean landingpage(){
//      return  Islandingpage.isDisplayed();
       return  driver.findElement(By.xpath("//*[contains(text(),' LMS')]")) .isDisplayed();

    }

}
