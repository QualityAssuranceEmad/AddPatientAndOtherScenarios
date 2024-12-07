    package tests;
    import data.ExcelReader;
    import data.JsonDataReader;
    import io.qameta.allure.*;
    import org.json.simple.parser.ParseException;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.testng.Assert;
    import org.testng.annotations.*;
    import pages.PatientPage;
    import java.io.IOException;
    import java.io.InputStream;
    import java.time.Duration;
    import java.util.Properties;

    @Epic("Automate the testing of the New Patient3")
    @Feature("Different Patient Scenarios")
    @Owner("Emad maher")
    @Link(name="CarV System",url="http://dev.advintic.com:8003/login#login")
    
    public class TestingPatientScenarios extends TestBase {
        PatientPage patientObject;
        @DataProvider(name = "ExcelData")
        public Object[][] userRegisterData() throws IOException {
            // get data from Excel Reader class
            ExcelReader ER = new ExcelReader();
            return ER.getExcelData();
        }
    
        //Scenario 1: Valid Patient Information Entry
        @Description("in this test case 1 i enter Patient data for more than on Patient and read data from excel file ")
        @Story("Scenario 1: Valid Patient Information Entry")
        @Severity(SeverityLevel.CRITICAL)
    
        @Parameters({"Email", "Password", "FirstName", "MiddleName", "LastName", "Gender", "Address", "ReportPreference", "Nationality", "MobileNumber",
                "NationalId", "Email", "Residence", "Phone", "BloodGroup", "Weight", "DateOfBarth", "customer", "billing", "group", "priceList",
                "territory", "language", "jop", "Status", "patient", "relation", "description", "allergies", "surgical", "medication", "gyne", "medicalHistory",
                "TCPast", "TCPresent", "ACPast", "ACPresent", "Occupational", "Others", "information", "plan", "date", "card"})
        @Step("verify signIn to website with email {0} and password {1} in {environment} using {browser} {version}")

        @Test(priority = 1, alwaysRun = true, dataProvider = "ExcelData", description = "Enter all patient information")
        public void addingPatientFullInformationScenario(String User, String password, String FirstName, String MiddleName, String LastName,
                                                         String Gender, String Address, String ReportPreference, String Nationality, String MobileNumber, String NationalId,
                                                         String Email, String Residence, String Phone, String BloodGroup, String Weight, String DateOfBarth,
                                                         String customer, String billing, String group, String priceList, String territory, String language,
                                                         String jop, String Status, String patient, String relation, String description, String allergies,
                                                         String surgical, String medication, String gyne, String medicalHistory
                , String TCPast, String TCPresent, String ACPast, String ACPresent, String Occupational, String Others, String information, String plan, String date, String card) throws InterruptedException {
            patientObject = new PatientPage(driver);
            patientObject.loginToMyAcount(User, password);
            // go to creating patient form
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.healthcareSection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.patientSection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.addPatient)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.fullPatientForm)).click();
            Thread.sleep(3000);
            patientObject.addPatientName(FirstName, MiddleName, LastName);
            patientObject.patentDemographics(Gender, Address, ReportPreference, Nationality, MobileNumber, NationalId, Email, Residence, Phone, BloodGroup, Weight, DateOfBarth); // Pass Gender parameter
            patientObject.customerDetails(customer, billing, group, priceList, territory, language);
            patientObject.PersonalAndSocialHistory(jop, Status);
            Thread.sleep(1000);
            patientObject.patientRelation(patient, relation, description);
            patientObject.AllergiesAndSurgicalHistory(allergies, surgical, medication, gyne, medicalHistory);
            patientObject.RISKFACTORS(TCPast, TCPresent, ACPast, ACPresent, Occupational, Others);
            patientObject.MoreInformationSection(information);
            // patientObject.PlaneIsuranceSection(plan,date,card);
            patientObject.clickOnSaving();
            Thread.sleep(4000);
            patientObject.clickOnLogOut();
    
    
        }
/*
        //Scenario 2: Mandatory Field Validation
        @Severity(SeverityLevel.CRITICAL)
        @Story("Scenario 2: Mandatory Field Validation")
        @Description("in this test case 2 i sea if i click save patient withOut entering mandatory filed to validate error message")
        @Test(priority = 2, alwaysRun = true, description = "check Mandatory Fields validation")
        public void MandatoryFieldsTesting() throws IOException, ParseException, InterruptedException {
            JsonDataReader jsonReader = new JsonDataReader();
            jsonReader.JsonReader();
            patientObject = new PatientPage(driver);
            patientObject.loginToMyAcount(jsonReader.email, jsonReader.password);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.healthcareSection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.patientSection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.addPatient)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.fullPatientForm)).click();
            Thread.sleep(3000);
            patientObject.clickOnSaving();
            Thread.sleep(2000);
            String actualMessage = patientObject.AssertMandatory.getText();
            String expectedMessage = "Mandatory fields required in Patient\n\nFirst Name\nLast Name\nGender\nMobile\nEmail";
            Assert.assertEquals(actualMessage, expectedMessage);
            Allure.addAttachment("Assertion Message", actualMessage);
            System.out.println(patientObject.AssertMandatory.getText());
            patientObject.clickCloseErrorMessageForMandatory.click();
            Thread.sleep(2000);
            patientObject.clickOnLogOut();
    
        }
    
        //Scenario 3: Date of Birth Format Validation
        @Story("Scenario 3: Date of Birth Format Validation")
        @Severity(SeverityLevel.CRITICAL)
    
        @Description("in this test case 3 i check if i entered date of birth with invalid format to sea if message will appear or will accept wrong format")
        @Test(priority = 3, alwaysRun = true, description = "check Date OF Birth format validation")
        public void DateOfBirthValidation() throws IOException, ParseException, InterruptedException {
            JsonDataReader jsonReader = new JsonDataReader();
            jsonReader.JsonReader2();
            patientObject = new PatientPage(driver);
            patientObject.loginToMyAcount(jsonReader.email, jsonReader.password);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.healthcareSection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.patientSection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.addPatient)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.fullPatientForm)).click();
            Thread.sleep(3000);
    
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.FirstName)).sendKeys(jsonReader.Fname);
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.LastName)).sendKeys(jsonReader.Lname);
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.GederDropDownMenu)).sendKeys(jsonReader.Gender);
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.MobileNumber)).sendKeys(jsonReader.Mopile);
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.Email)).sendKeys(jsonReader.EmailAddress);
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.DateOfBarth)).sendKeys(jsonReader.DateOfBirth);
            patientObject.clickOnSaving();
            Thread.sleep(2000);
            String actualMessage = patientObject.AssertDateOfBirthFormateValdation.getText();
            String expectedMessage = "Date Invalid date must be in format: dd-mm-yyyy";
            Assert.assertEquals(actualMessage, expectedMessage);
            System.out.println(patientObject.AssertDateOfBirthFormateValdation.getText());
            Allure.addAttachment("Assertion Message", actualMessage);
    
            patientObject.clickCloseErrorMessageForDateOfBarth.click();
            Thread.sleep(2000);
            patientObject.clickOnLogOut();
    
    
        }
        //Scenario 4: Duplicate Patient Check

        @Description("in this test case 4 i check if there any duplicated patient with the same mandatory data ")
        @Story("Scenario 4: Duplicate Patient Check")
        @Severity(SeverityLevel.CRITICAL)
        @Test(priority = 4, alwaysRun = true, description = "check if there any Duplicated patient with the same unique data ")
        public void DublcationPatentCheck() throws IOException, ParseException, InterruptedException {
            JsonDataReader jsonReader = new JsonDataReader();
            jsonReader.JsonReader3();
            patientObject = new PatientPage(driver);
            Allure.step("go to login page and login with email and password after that click on HealthCare and then click on patient  ");
            patientObject.loginToMyAcount(jsonReader.email, jsonReader.password);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.healthcareSection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.patientSection)).click();
            Thread.sleep(1000);
            patientObject.FilteringByFullName.clear();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.FilteringByFullName)).sendKeys(jsonReader.fullNameCheck);
            patientObject.FilteringByEmail.clear();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.FilteringByMobile)).sendKeys(jsonReader.mopilecheck);
            patientObject.FilteringByMobile.clear();
            wait.until(ExpectedConditions.elementToBeClickable(patientObject.FilteringByEmail)).sendKeys(jsonReader.emailCheck);
            Thread.sleep(4000);
            String actualMessage = patientObject.AssertNumberOfRwo.getText();
            Assert.assertEquals(actualMessage, "1 of 1", "The displayed rows count is not 1 of 1, indicating possible duplication or this patient doesn't exist.");
            System.out.println(patientObject.AssertNumberOfRwo.getText());
            Thread.sleep(2000);
            patientObject.clickOnLogOut();
        }
  */  }