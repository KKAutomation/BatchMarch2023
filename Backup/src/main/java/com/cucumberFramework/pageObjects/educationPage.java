package com.cucumberFramework.pageObjects;

import com.cucumberFramework.testBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class educationPage extends TestBase {
    //constructor
    public educationPage() //constructor
    {
        PageFactory.initElements(driver, this);
    }
// Webelement  initialisation


    @FindBy(xpath = "//input[@id='user_login_id']")
    public WebElement useridtxt;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordtxt;
    @FindBy(xpath = "//input[@value='Sign In']")
    public WebElement signinButton;
    @FindBy(xpath = "/html/body/div[2]/aside/section/ul/li[4]/a/span")
    public WebElement studentmanagementLink;
    @FindBy(xpath = "/html/body/div[2]/aside/section/ul/li[4]/ul/li[1]/a")
    public WebElement addstudentLink;
    @FindBy(xpath = "//input[@id='student_name']")
    public WebElement inputStudentname;
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement inputdob;
    @FindBy(xpath = "//input[@id='stu_filio_no']")
    public WebElement inputstudentid;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement inputmobilenumber;
    @FindBy(xpath = "//select[@id='t_mst_category_id']")
    public WebElement category;
    @FindBy(xpath = "//input[@id='address_pincode']")
    public WebElement inputpin;
    @FindBy(xpath = "//textarea[@id='present_address']")
    public WebElement inputpresentaddress;
    @FindBy(xpath = "//textarea[@id='permanent_address']")
    public WebElement inputpermanentaddress;
    @FindBy(xpath = "//select[@id='t_mst_cls_class_id']")
    public WebElement inputcoursename;
    @FindBy(xpath = "//select[@id='t_mst_sec_section_id']")
    public WebElement inputsemestername;
    @FindBy(xpath = "input[@id='adm_roll_number']")
    public WebElement inputroll;
    @FindBy(xpath = "//input[@id='adm_admission_date']")
    public WebElement inputadmissiondate;
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement inputfathername;
    @FindBy(xpath = "//input[@id='father_ph_number']")
    public WebElement inputfathernumber;
    @FindBy(xpath = "//input[@id='father_adhar_number']")
    public WebElement inputfatheraadhar;
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement inputfatheroccupation;
    @FindBy(xpath = "//input[@id='father_designation']")
    public WebElement inputfatherdesg;
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement inputmothername;
    @FindBy(xpath = "//input[@id='mother_ph_number']")
    public WebElement inputmmobile;
    @FindBy(xpath = "//input[@id='mother_adhar_number']")
    public WebElement inputmaadhar;
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement inputmotheroccupation;
    @FindBy(xpath = "//input[@id='mother_designation']")
    public WebElement inputmotherdesg;
    @FindBy(xpath = "//input[@id='email_id']")
    public WebElement inputemail;
    @FindBy(xpath = "//select[@id='t_mst_religious_id']")
    public WebElement inputreligious;
    @FindBy(xpath = "//select[@id='mother_tounge']")
    public WebElement inputmothertounge;
    @FindBy(xpath = "//input[@id='student_bank_ac_number']")
    public WebElement inputbankac;

    @FindBy(xpath = "//input[@id='student_bank_ifsc_code']")
    public WebElement inputbankifsc;
    @FindBy(xpath = "//input[@id='student_adhar_number']")
    public WebElement inputaadhar;
    @FindBy(xpath = "//input[@id='last_school_name']")
    public WebElement inputschool;
    @FindBy(xpath = "//input[@id='application_form_no']")
    public WebElement inputapplicationno;

    @FindBy(xpath = "//input[@id='apply_from__date']")
    public WebElement inputdate;


    //function starts from here
    public void openeducation(String url) {
        driver.get(url);
    }

    public void logintoeducation(String uid, String pwd) {
        useridtxt.sendKeys(uid);
        passwordtxt.sendKeys(pwd);
        signinButton.click();
    }

    public void navigateAddStudentPage() {
        studentmanagementLink.click();
        addstudentLink.click();
    }

    public void StudentnameInput(String studentname) {

        inputStudentname.sendKeys(studentname);
    }

    public void Dobinput(String dob) {
        inputdob.sendKeys(dob);
    }

    public void selectGender(String genderType) {

        if (genderType.equalsIgnoreCase("Male")) {

            driver.findElement(By.xpath("  //input[@value='Male']")).click();
        }

        if (genderType.equalsIgnoreCase("Female") ){

            driver.findElement(By.xpath("  //input[@value='Female']")).click();
        }

    }

    public void Mobileinput(String mobile){

        inputmobilenumber.sendKeys(mobile);
    }
public void selctCategory(String CatType){
    Select drpcat = new Select(driver.findElement(By.xpath("//select[@id='t_mst_category_id']")));
    drpcat.selectByVisibleText(CatType);
  }

  public void validateErrormsg() throws InterruptedException {
        Boolean  errormsgvalidation = true;

        driver.findElement(By.xpath("//*[@id=\"entryFrm\"]/center/div/button[1]")).click();
        Thread.sleep(5000);
        List<WebElement> elements =  driver.findElements(By.xpath("//*[@class=\"error-message\"]"));
        System.out.println("Number of elements:" +elements.size());

        if ((! elements.get(0).getText().equalsIgnoreCase("Please Add Student Name"))){

            errormsgvalidation=false;

      }



    }
    public void Pininput(String pin){

        inputpin.sendKeys(pin);
    }
    public void Presentaddressinput(String pradd){

        inputpresentaddress.sendKeys(pradd);
    }
    public void Permanentaddressinput(String prmadd){
        inputpermanentaddress.sendKeys(prmadd);
    }
    public void Coursenameinput(String crsname){
        inputcoursename.sendKeys(crsname);
    }
    public void Semesternameinput(String smname){
        inputsemestername.sendKeys(smname);
    }
    public void Rollinput(String rlname){
        inputroll.sendKeys(rlname);
    }
    public void Admissiondateinput(String addate){
        inputadmissiondate.sendKeys(addate);
    }
    public void Fathernameinput(String fname){
        inputfathername.sendKeys(fname);
    }
    public void Fathernumberinput(String fnum){
        inputfathernumber.sendKeys(fnum);
    }
    public void Fatheraadharinput(String faadhar){
        inputfatheraadhar.sendKeys(faadhar);
    }
    public void Fatheroccupationinput(String foc){
        inputfatheroccupation.sendKeys(foc);
    }
    public void Fatherdesginput(String fdesg){
        inputfatherdesg.sendKeys(fdesg);
    }
    public void Mothernameinput(String mname){
        inputmothername.sendKeys(mname);
    }
    public void Mothernumberinput(String mnum){
        inputmmobile.sendKeys(mnum);
    }
    public void Motheraadharinput(String maadhar){
        inputmaadhar.sendKeys(maadhar);
    }
    public void Motheroccupationinput(String moc){
        inputmotheroccupation.sendKeys(moc);
    }
    public void Motherdesginput(String mdesg){
        inputmotherdesg.sendKeys(mdesg);
    }
    public void Emailinput(String mail){
        inputemail.sendKeys(mail);
    }
    public void Religiousinput(String rlg){
        inputreligious.sendKeys(rlg);
    }
    public void selectMothertounge(String MtoungeType){
        Select drpmtounge = new Select(driver.findElement(By.xpath("//select[@id='mother_tounge']")));
        drpmtounge.selectByVisibleText(MtoungeType);
    }

    public void Bankacinput(String bac){
        inputbankac.sendKeys(bac);
    }
    public void Bankifscinput(String bifsc){
        inputbankifsc.sendKeys(bifsc);
    }
    public void Aadharinput(String aadhar){
        inputaadhar.sendKeys(aadhar);
    }
    public void Schoolinput(String school){
        inputschool.sendKeys(school);
    }
    public void Applicationnumberinput(String apno){
        inputapplicationno.sendKeys(apno);
    }
    public void Dateinput(String date){
        inputdate.sendKeys(date);
    }

}
