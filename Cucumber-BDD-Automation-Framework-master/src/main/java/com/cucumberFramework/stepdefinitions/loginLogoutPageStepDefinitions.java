package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.CalculatorPage;
import com.cucumberFramework.pageObjects.lmsloginpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LoginLogoutPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginLogoutPageStepDefinitions extends TestBase {


    lmsloginpage lmspage = new lmsloginpage();


    CalculatorPage cp = new CalculatorPage();

    @When("^i open calculator in web \"([^\"]*)\"$")
    public void iOpenCalculatorInWeb(String calurl) {
        driver.get(calurl);
    }

    @And("^i enter  \"([^\"]*)\"$")
    public void iEnter(String digit1) {

        cp.enterdigitone(digit1);
    }


    @And("^i enter math operator \"([^\"]*)\"$")
    public void iEnterMathOperator(String opr) {
        cp.enterOpr(opr);

    }


    @And("^second input  \"([^\"]*)\"$")
    public void secondInput(String digit2) {

        cp.enterdigittwo(digit2);

    }

    @And("^I enter  equal sign$")
    public void iEnterEqualSign() {
        cp.clickequalsign();
    }

    @Then("^it should display result as \"([^\"]*)\"$")
    public void itShouldDisplayResultAs(String result) {
        Assert.assertTrue(cp.getoutput().equalsIgnoreCase(result));

    }

    //*********************************************************************************
    @When("^user open lms system using \"([^\"]*)\"$")
    public void userOpenLmsSystemUsing(String url) {
        driver.get(url);


    }


    @And("^enter \"([^\"]*)\"$")
    public void enter(String uid) {

        lmspage.inputUserID(uid);

    }


    @And("^enter password \"([^\"]*)\"$")
    public void enterPassword(String pwd) {
        lmspage.inputpwd(pwd);
    }

    @And("^click submit button$")
    public void clickSubmitButton() {
        lmspage.clickloginbButton();
    }

    @Then("^user should see landing page$")
    public void userShouldSeeLandingPage() {
        Assert.assertTrue(lmspage.landingpage());

    }


}
