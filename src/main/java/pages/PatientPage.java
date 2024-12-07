package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PatientPage extends PageBase {
    public PatientPage(WebDriver driver) {
        super(driver);

    }

    //logoutWebElement
    @FindBy(xpath = "/html/body/div[1]/header/div/div[3]/ul/li[5]/a/span[1]")
    WebElement logOutButton1;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[3]/ul/li[5]/div/a[8]")
    WebElement logOutButton2;
    //webElements to reach the full patient page
    @FindBy(xpath = "//*[@id=\"login_email\"]")
    public WebElement LoginEmail;
    @FindBy(xpath = "//*[@id=\"login_password\"]")
    public WebElement passoward;
    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/section[1]/div[2]/form/div[2]/div[1]/button")
    public WebElement loginButton;
    @FindBy(xpath = "/html/body/app-root/app-app-layout/div/app-header/div/a/span")
    public WebElement messageLogin;
    @FindBy(xpath = "//a[@href='/app/healthcare']")
    public WebElement healthcareSection;
    @FindBy(xpath = "(//div[@class='widget widget-shadow shortcut-widget-box'])[5]")
    public WebElement patientSection;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/button[2]")
    public WebElement addPatient;
    @FindBy(xpath = "/html/body/div[6]/div/div/div[3]/div[1]/button")

    public WebElement fullPatientForm;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[1]/div/div/div[1]/div/div/div[1]/h3")
    public WebElement newPatientPage;
    //Patent Name Deatalis

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/input")
    public WebElement FirstName;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/input")
    WebElement MiddleName;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[2]/div[2]/div[3]/form/div[2]/div/div[2]/div[1]/input")
    public WebElement LastName;
    //patient Demographics
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/div/div/input")
    public WebElement GederDropDownMenu;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/div/div/ul")

    List<WebElement> ChooseGender;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[2]/div/div[2]/div[1]/input")
    WebElement Address;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[2]/form/div[4]/div/div[2]/div[1]/select")
    WebElement ReportPreferenceDropDownMenu;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/div/div/input")
    WebElement NationalityDropDownMenu;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/div/div/ul")
    List<WebElement> ChooseNationality;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[2]/form/div[5]/div/div[2]/div[1]/input")
    public WebElement MobileNumber;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[4]/div/div[2]/div[1]/input")
    WebElement NationalityId;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[2]/form/div[6]/div/div[2]/div[1]/input")
    public WebElement Email;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[5]/div/div[2]/div[1]/select")
    WebElement ResidenceTypeList;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[2]/form/div[7]/div/div[2]/div[1]/input")
    WebElement Phone;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[6]/div/div[2]/div[1]/select")
    WebElement BloodGroupList;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[2]/form/div[8]/div/div[2]/div[1]/input")
    WebElement Weight;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[1]/form/div[7]/div/div[2]/div[1]/input")
    public WebElement DateOfBarth;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[3]/div[2]/div[2]/form/div[9]/div/label/span[1]/input")
    WebElement InsuranceCheckBox;
    //customer details section
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[1]")
    WebElement ClickCustomerDetailsSection;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/div/div/input")
    WebElement Customer;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/div/div/ul")
    List<WebElement> ChoosingCustomerEmail;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[2]/form/div[1]/div/div[2]/div[1]/div/div/input")
    WebElement BillingCurrency;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[2]/form/div[1]/div/div[2]/div[1]/div/div/ul")
    List<WebElement> ChoosingBillingCurrency;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[1]/form/div[2]/div/div[2]/div[1]/div/div/input")
    WebElement CustomerGroup;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[1]/form/div[2]/div/div[2]/div[1]/div/div/ul")
    List<WebElement> ChooseGroup;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/div/input")
    WebElement DefaultPriceList;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/div/ul")
    List<WebElement> ChoosingDefaultPriceList;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/div/div/input")
    WebElement Territory;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/div/div/ul")
    List<WebElement> ChoosingTerritories;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[2]/form/div[3]/div/div[2]/div[1]/div/div/input")
    WebElement PrintLanguage;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div[2]/form/div[3]/div/div[2]/div[1]/div/div/ul")
    List<WebElement> ChoosingLanguage;
    //personal and social history
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[5]/div[1]")
    WebElement ClickOnPersonalSection;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[5]/div[2]/div[1]/form/div/div/div[2]/div[1]/input")
    WebElement Occupation;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[5]/div[2]/div[2]/form/div/div/div[2]/div[1]/select")
    WebElement MaritalStatusDropDown;
    //Patient Relation Section
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[6]/div[1]")
    WebElement ClickRelationSection;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/form/div/div[3]/div/div[1]/button[4]")
    WebElement AddRowButton;

    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/form/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/form/div[1]/div/div[2]/div[1]/div/div/input")
    WebElement PatientName2;

    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/form/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/form/div[2]/div/div[2]/div[1]/select")
    WebElement RelationDropDown2;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/form/div/div[2]/div[2]/div[1]/div/div/div[4]/div")
    WebElement ClickOnEditPatient;

    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/form/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/form/div[3]/div/div[2]/div[1]/textarea")
    WebElement Description;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[6]/div[2]/div/form/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/span[2]/button[1]")
    WebElement ClickingSave;

    //Allergies, Medical and Surgical History
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[7]/div[1]")
    WebElement AllergiesAndSurgicalHistory;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[7]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/div/div/input")
    WebElement Allergies;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[7]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/div/div/ul/li[1]")
    WebElement ChoosingAllergies;
    @FindBy(xpath = "//textarea[@data-fieldname='surgical_history']")
    WebElement SurgicalHistory;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[7]/div[2]/div[1]/form/div[2]/div/div[2]/div[1]/textarea")
    WebElement Medication;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[7]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/textarea")
    WebElement GyneAndOBSHistoryIncludingTheLMP;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[7]/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/textarea")
    WebElement MedicalHistory;
    //Risk Factors section
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[8]/div[1]")
    WebElement ClickingRiskSection;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[8]/div[2]/div[1]/form/div[1]/div/div[2]/div[1]/input")
    WebElement TobaccoConsumptionPast;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[8]/div[2]/div[1]/form/div[2]/div/div[2]/div[1]/input")
    WebElement TobaccoConsumptionPresent;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[8]/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/input")
    WebElement AlcoholConsumptionPast;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[8]/div[2]/div[1]/form/div[4]/div/div[2]/div[1]/input")
    WebElement AlcoholConsumptionPresent;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[8]/div[2]/div[2]/form/div[1]/div/div[2]/div[1]/textarea")
    WebElement OccupationalHazardsAndEnvironmentalFactors;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[8]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/textarea")
    WebElement OtherRiskFactors;
    // More Information Section
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[9]/div[1]")
    WebElement ClickingMoreInformation;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[9]/div[2]/div/form/div/div/div[2]/div[1]/textarea")
    WebElement PatientDetails;
    //INSURANCE PLANS section
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[10]/div[2]/div/form/div[1]/div[3]/div/div[1]/button[4]")
    WebElement AddROWINSURANCEPLANS;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[10]/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/div/div/div[5]/div")
    WebElement ClickEditingPlan;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[10]/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/form/div[1]/div/div[2]/div[1]/div/div/input")
    WebElement InsurancePlan;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[10]/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/form/div[1]/div/div[2]/div[1]/div/div/ul/li[1]")
    WebElement ChoosingPlaneInsurance;
    @FindBy(css = "input[data-fieldname='expiry_date']")
    WebElement ExpiryDate;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[10]/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/form/div[3]/div/div[2]/div[1]/input")
    WebElement MemberCardID;
    @FindBy(xpath = "//*[@id=\"page-Patient\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/div[10]/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/span[2]/button[1]")
    WebElement savingInsurance;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/button[2]")
    WebElement ClickingSavePatient;
    @FindBy(className = "msgprint")
    public WebElement AssertMandatory;
    @FindBy(xpath = "/html/body/div[7]/div/div/div[2]/div[1]/div")
    public WebElement AssertDateOfBirthFormateValdation;
    @FindBy(css = "input[data-fieldname='national_id']")
    public WebElement FilteringByNationalId;
    @FindBy(css = "input[data-fieldname='patient_name']")
    public WebElement FilteringByFullName;
    @FindBy(css = "input[data-fieldname='mobile']")
    public WebElement FilteringByMobile;
    @FindBy(css = "input[data-fieldname='email']")
    public WebElement FilteringByEmail;
    @FindBy(xpath = "/html/body/div[7]/div/div/div[1]/div[2]/button[2]")
   public WebElement clickCloseErrorMessageForMandatory;
    @FindBy(xpath = "/html/body/div[7]/div/div/div[1]/div[2]/button[2]")
    public WebElement clickCloseErrorMessageForDateOfBarth;
    @FindBy(xpath = "//div[@class='level-right']/span[@class='list-count']/span")
    public WebElement AssertNumberOfRwo;
    @Step("Login Step with username :{0} ,password:{1}")
    public void loginToMyAcount(String email, String pass) {

        setTextElementText(LoginEmail, email);
        setTextElementText(passoward, pass);
        clickButton(loginButton);

    }
    public void addPatientName(String fname, String mname, String lname) {
        setTextElementText(FirstName, fname);
        setTextElementText(MiddleName, mname);
        setTextElementText(LastName, lname);
    }

    public void patentDemographics(String gender, String address, String reportPreference, String nationality,
                                   String mobileNumber, String nationalityId, String email, String residenceType,
                                   String phone, String bloodGroup, String weight, String dateOfBarth) throws InterruptedException {
        clickButton(GederDropDownMenu);

        // Here, choose the gender based on the parameter value passed
        setTextElementText(GederDropDownMenu, gender);
        // Thread.sleep(1000);
        //  ChooseGender.get(0).click();
        setTextElementText(Address, address);
        Thread.sleep(1000);
        select = new Select(ReportPreferenceDropDownMenu);
        select.selectByVisibleText(reportPreference);
        NationalityDropDownMenu.clear();
        setTextElementText(NationalityDropDownMenu, nationality);
        Thread.sleep(1000);
        //ChooseNationality.get(0).click();
        setTextElementText(MobileNumber, mobileNumber);

        setTextElementText(NationalityId, nationalityId);
        setTextElementText(Email, email);
        select = new Select(ResidenceTypeList);
        select.selectByVisibleText(residenceType);
        setTextElementText(Phone, phone);
        select = new Select(BloodGroupList);
        select.selectByVisibleText(bloodGroup);
        setTextElementText(Weight, weight);
        setTextElementText(DateOfBarth, dateOfBarth);
        clickButton(InsuranceCheckBox);

    }

    public void customerDetails(String customer, String billingCurrency,
                                String customerGroup, String defaultPriceList, String territory, String printLanguage) throws InterruptedException {
        clickButton(ClickCustomerDetailsSection);
        setTextElementText(Customer, customer);
        Thread.sleep(1000);
       // ChoosingCustomerEmail.get(0).click();
        BillingCurrency.clear();
        setTextElementText(BillingCurrency, billingCurrency);
        Thread.sleep(1000);
      //  ChoosingBillingCurrency.get(0).click();
        CustomerGroup.clear();
        setTextElementText(CustomerGroup, customerGroup);
        //Thread.sleep(3000);
        // ChooseGroup.get(0).click();
        setTextElementText(DefaultPriceList, defaultPriceList);
        Thread.sleep(1000);
      //  ChoosingDefaultPriceList.get(0).click();
        Territory.clear();
        setTextElementText(Territory, territory);
        Thread.sleep(1000);
       // ChoosingTerritories.get(0).click();
        PrintLanguage.clear();
        setTextElementText(PrintLanguage, printLanguage);
        Thread.sleep(1000);
      //  ChoosingLanguage.get(0).click();
    }

    public void PersonalAndSocialHistory(String occupation, String maritalStatus) throws InterruptedException {
        clickButton(ClickOnPersonalSection);
        setTextElementText(Occupation, occupation);
        select = new Select(MaritalStatusDropDown);
        select.selectByVisibleText(maritalStatus);
    }

    public void patientRelation(String patientNAme, String relation, String description) throws InterruptedException {
        clickButton(ClickRelationSection);
        clickButton(AddRowButton);
        Thread.sleep(1000);
        clickButton(ClickOnEditPatient);
        setTextElementText(PatientName2, patientNAme);
        select = new Select(RelationDropDown2);
        select.selectByVisibleText(relation);
        setTextElementText(Description, description);
        clickButton(ClickingSave);

    }

    public void AllergiesAndSurgicalHistory(String allergies, String surgical, String medication, String medicalHistory,
                                            String gyne) throws InterruptedException {
        clickButton(AllergiesAndSurgicalHistory);
        setTextElementText(Allergies, allergies);
        clickButton(ChoosingAllergies);
        Thread.sleep(2000);
        setTextElementText(SurgicalHistory, surgical);
        setTextElementText(Medication, medication);
        setTextElementText(MedicalHistory, medicalHistory);
        setTextElementText(GyneAndOBSHistoryIncludingTheLMP, gyne);
    }

    public void RISKFACTORS(String TcPast, String TcPresent, String AcpPast, String AcPresent,
                            String Occupational, String Other) throws InterruptedException {
        clickButton(ClickingRiskSection);
        setTextElementText(TobaccoConsumptionPast, TcPast);
        setTextElementText(TobaccoConsumptionPresent, TcPresent);
        setTextElementText(AlcoholConsumptionPast, AcpPast);
        setTextElementText(AlcoholConsumptionPresent, AcPresent);
        setTextElementText(OccupationalHazardsAndEnvironmentalFactors, Occupational);
        setTextElementText(OtherRiskFactors, Other);
    }

    public void MoreInformationSection(String information) throws InterruptedException {
        clickButton(ClickingMoreInformation);
        setTextElementText(PatientDetails, information);
    }

    public void PlaneIsuranceSection(String plane, String expiryDate, String memberCard) throws InterruptedException {
        clickButton(AddROWINSURANCEPLANS);
        clickButton(ClickEditingPlan);
        setTextElementText(InsurancePlan, plane);
        setTextElementText(ExpiryDate, expiryDate);
        setTextElementText(MemberCardID, memberCard);
        Thread.sleep(1000);
        clickButton(savingInsurance);

    }

    public void clickOnLogOut() throws InterruptedException {
        clickButton(logOutButton1);
        Thread.sleep(1000);
        clickButton(logOutButton2);
    }

    public void clickOnSaving() {
        clickButton(ClickingSavePatient);

    }
}
