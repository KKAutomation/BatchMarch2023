Feature: this feature is to test education system

  Scenario Outline: create add student to the system
    When user login to the system with "<userid>" and "<password>"
    And click on student management
    And click add student
    And input student details "<StudentName>" and "<Gender>" and "<DOB>" and "<StudentId/DeviceID>" and "<MobileNo>" and "<Category>" and "<PinCode>" and "<PresentAddress>" and "<PermanentAddress>" and "<Class/Course Name>" and "<Section/Semester Name>" and "<Roll No.>" and "<AdmissionDate>" and "<FatherName>" and "<FatherMobileNo.>" and "<FatherAdharNumber>" and "<FatherOccupation>" and "<FatherDesignation>" and "<MotherName>" and "<MotherNo.>" and "<MotherAdharNumber>" and "<MotherOccupation>" and "<MotherDesignation>" and "<EmailId>" and "<Religious>" and "<MotherTounge>" and "<BankA/CNo.>" and "<BankName>" and "<BankIFSCCode>" and "<StudentAdharCardNumber>" and "<LastSchoolName>" and "<ApplicationFormNo.>" and "<BelongstoBPLFamily>" and "<StudentBelongs>" and "<BloodGroup>" and "<UploadParentPhoto>" and "<UploadStudentPhoto>" and "<ApplyFormDate>" and "<TakeStudentFacility>"
    And click submit button
    Then user should add student
    Examples:
      | userid | password | StudentName | Gender | DOB | StudentId/DeviceID | MobileNo | Category | PinCode | PresentAddress | PermanentAddress | Class/Course Name | Section/Semester Name | Roll No. | AdmissionDate | FatherName | FatherMobileNo. | FatherAdharNumber | FatherOccupation | FatherDesignation | MotherName | MotherNo. | MotherAdharNumber | MotherOccupation | MotherDesignation | EmailId | Religious | MotherTounge | BankA/CNo. | BankName | BankIFSCCode | StudentAdharCardNumber | LastSchoolName | ApplicationFormNo. | BelongstoBPLFamily | StudentBelongs | BloodGroup | UploadParentPhoto | UploadStudentPhoto | ApplyFormDate | TakeStudentFacility |
