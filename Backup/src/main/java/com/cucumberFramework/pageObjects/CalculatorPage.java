package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage {

    @FindBy(xpath="//*[@id=\"cs_calculator_form\"]/table/tbody/tr[7]/td[1]/button")
    public WebElement digitzero;
    @FindBy(xpath="//*[@id=\"cs_calculator_form\"]/table/tbody/tr[6]/td[1]/button")
    public WebElement digit1;



    public void clickdigit(String clickdigt ){


        digitzero.click();

    }

}
