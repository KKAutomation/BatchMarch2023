package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.educationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class educationdef {

    educationPage edpage = new educationPage();

    @When("^user login to the system with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLoginToTheSystemWithAnd(String uid, String pwd) {
        String URLED = "https://educationmainproduct.zemusidemo.in/";
        edpage.openeducation(URLED);
        edpage.logintoeducation(uid, pwd);

    }

    @And("^click on student management$")
    public void clickOnStudentManagement() {
        edpage.navigateAddStudentPage();

    }



    @And("^input student details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void inputStudentDetailsAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAndAnd(String arg1, String arg2
            , String stdname, String gender, String dob, String arg5, String mobile, String arg7, String pin, String pradd, String prmadd, String crsname, String smname, String rlname, String addate, String fname, String fnum, String faadhar, String foc, String fdesg, String mname, String mnum, String maadhar, String moc, String mdesg, String mail, String rlg, String mtounge, String bac, String bifsc, String aadhar, String school, String apno, String date, String arg34, String arg35, String arg36, String arg37, String arg38) throws Throwable {

       // edpage.validateErrormsg();
        edpage.StudentnameInput(stdname);
        edpage.Dobinput(dob);
        edpage.selectGender(gender);
        edpage.Mobileinput(mobile);
        edpage.Pininput(pin);
        edpage.Presentaddressinput(pradd);
        edpage.Permanentaddressinput(prmadd);
        edpage.Coursenameinput(crsname);
        edpage.Semesternameinput(smname);
        edpage.Rollinput(rlname);
        edpage.Admissiondateinput(addate);
        edpage.Fathernameinput(fname);
        edpage.Fathernumberinput(fnum);
        edpage.Fatheraadharinput(faadhar);
        edpage.Fatheroccupationinput(foc);
        edpage.Fatherdesginput(fdesg);
        edpage.Mothernameinput(mname);
        edpage.Mothernumberinput(mnum);
        edpage.Motheraadharinput(maadhar);
        edpage.Motheroccupationinput(moc);
        edpage.Motherdesginput(mdesg);
        edpage.Emailinput(mail);
        edpage.Religiousinput(rlg);
        edpage.selectMothertounge(mtounge);
        edpage.Bankacinput(bac);
        edpage.Bankifscinput(bifsc);
        edpage.Aadharinput(aadhar);
        edpage.Schoolinput(school);
        edpage.Applicationnumberinput(apno);
        edpage.Dateinput(date);

    }

    @And("^click submit button$")
    public void clickSubmitButton() {
    }

    @Then("^user should add student$")
    public void userShouldAddStudent() {
    }
}
