package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class CalculatorPage {

    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[7]/td[1]/button")
    public WebElement digitzero;
    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[6]/td[1]/button")
    public WebElement digit1;
//    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[6]/td[2]/button")
    @FindBy(xpath="//button[@name='cs_two']")
    public WebElement digit2;
    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[6]/td[3]/button")
    public WebElement digit3;
    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[5]/td[1]/button")
    public WebElement digit4;
    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[5]/td[2]/button")
    public WebElement digit5;
    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[5]/td[3]/button")
    public WebElement digit6;
    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[4]/td[1]/button")
    public WebElement digit7;
    @FindBy(xpath = "//*[@id=\"cs_calculator_form\"]/table/tbody/tr[4]/td[2]/button")
    public WebElement digit8;
    @FindBy(xpath = " //*[@id=\"cs_calculator_form\"]/table/tbody/tr[4]/td[3]/button")
    public WebElement digit9;
    @FindBy(xpath = " //*[@id=\"cs_calculator_form\"]/table/tbody/tr[6]/td[4]/button")
    public WebElement oprplus;
    @FindBy(xpath = " //*[@id=\"cs_calculator_form\"]/table/tbody/tr[7]/td[2]/button")
    public WebElement dot;

    @FindBy(xpath = " //*[@id='cs_calculator_form']/table/tbody/tr[7]/td[4]/button")
    public WebElement equalsign;

    @FindBy(xpath = " //*[@id=\"cs_display\"]")
    public WebElement output;




    public void enterdigitone(String digitone) {

        if (digitone.equals("0")) {
            digit1.click();
        }
        if (digitone.equals("1")) {
            digit2.click();

        }
        if (digitone.equals("2")) {
            digit3.click();
        }
        if (digitone.equals("3")) {
            digit4.click();
        }

    }

    public void enterdigittwo(String inputdigit2) {

        if (inputdigit2.equals("0")) {
            digit1.click();
        }
        if (inputdigit2.equals("1")) {
            digit2.click();
        }
        if (inputdigit2.equals("2")) {
            digit1.click();
        }
        if (inputdigit2.equals("3")) {
            digit2.click();
        }
    }


    public void enterOpr(String opr) {

        if (opr.equals("plus")) {
            oprplus.click();
        }
//        if (opr.equals("1")) {
//            digit2.click();
//        }
//        if (opr.equals("2")) {
//            digit1.click();
//        }
//        if (digit1.equals("3")) {
//            digit2.click();
//        }

    }

    public void clickequalsign(){
        equalsign.click();
    }

    public String getoutput(){
       return output.getText();
    }


}
