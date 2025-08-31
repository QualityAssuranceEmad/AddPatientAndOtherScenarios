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

    // Logout Webelements
@FindBy(xpath = "//a[contains(@href, '#log-out')]/span[1]")
WebElement logOutButton1;
@FindBy(xpath = "//a[contains(@href, '#log-out')]")
WebElement logOutButton2;

// WebElements to reach the full patient page
@FindBy(xpath = "//input[@id='login_email']")
public WebElement LoginEmail;
@FindBy(xpath = "//input[@id='login_password']")
public WebElement passoward;
@FindBy(xpath = "//button[text()='Login']")
public WebElement loginButton;
@FindBy(xpath = "//span[text()='Healthcare']")
public WebElement messageLogin;
@FindBy(xpath = "//a[@href='/app/healthcare']")
public WebElement healthcareSection;
@FindBy(xpath = "//div[contains(@class, 'shortcut-widget-box')][5]")
public WebElement patientSection;
@FindBy(xpath = "//button[text()='Add Patient']")
public WebElement addPatient;
@FindBy(xpath = "//button[text()='Full Patient Form']")
public WebElement fullPatientForm;
@FindBy(xpath = "//h3[text()='New Patient']")
public WebElement newPatientPage;

// Patient Name Details
@FindBy(xpath = "//input[@data-fieldname='first_name']")
public WebElement FirstName;
@FindBy(xpath = "//input[@data-fieldname='middle_name']")
WebElement MiddleName;
@FindBy(xpath = "//input[@data-fieldname='last_name']")
public WebElement LastName;

// Patient Demographics
@FindBy(xpath = "//input[@data-fieldname='gender']")
public WebElement GederDropDownMenu;
@FindBy(xpath = "//input[@data-fieldname='gender']/following-sibling::ul")
List<WebElement> ChooseGender;
@FindBy(xpath = "//input[@data-fieldname='address']")
WebElement Address;
@FindBy(xpath = "//select[@data-fieldname='report_preference']")
WebElement ReportPreferenceDropDownMenu;
@FindBy(xpath = "//input[@data-fieldname='nationality']")
WebElement NationalityDropDownMenu;
@FindBy(xpath = "//input[@data-fieldname='nationality']/following-sibling::ul")
List<WebElement> ChooseNationality;
@FindBy(xpath = "//input[@data-fieldname='mobile']")
public WebElement MobileNumber;
@FindBy(xpath = "//input[@data-fieldname='national_id']")
WebElement NationalityId;
@FindBy(xpath = "//input[@data-fieldname='email']")
public WebElement Email;
@FindBy(xpath = "//select[@data-fieldname='residence_type']")
WebElement ResidenceTypeList;
@FindBy(xpath = "//input[@data-fieldname='phone']")
WebElement Phone;
@FindBy(xpath = "//select[@data-fieldname='blood_group']")
WebElement BloodGroupList;
@FindBy(xpath = "//input[@data-fieldname='weight']")
WebElement Weight;
@FindBy(xpath = "//input[@data-fieldname='date_of_birth']")
public WebElement DateOfBarth;
@FindBy(xpath = "//input[@data-fieldname='insurance_check']")
WebElement InsuranceCheckBox;

// Customer details section
@FindBy(xpath = "//div[contains(@class, 'collapsible-area') and .//span[text()='Customer Details']]")
WebElement ClickCustomerDetailsSection;
@FindBy(xpath = "//input[@data-fieldname='customer']")
WebElement Customer;
@FindBy(xpath = "//input[@data-fieldname='customer']/following-sibling::ul")
List<WebElement> ChoosingCustomerEmail;
@FindBy(xpath = "//input[@data-fieldname='billing_currency']")
WebElement BillingCurrency;
@FindBy(xpath = "//input[@data-fieldname='billing_currency']/following-sibling::ul")
List<WebElement> ChoosingBillingCurrency;
@FindBy(xpath = "//input[@data-fieldname='customer_group']")
WebElement CustomerGroup;
@FindBy(xpath = "//input[@data-fieldname='customer_group']/following-sibling::ul")
List<WebElement> ChooseGroup;
@FindBy(xpath = "//input[@data-fieldname='default_price_list']")
WebElement DefaultPriceList;
@FindBy(xpath = "//input[@data-fieldname='default_price_list']/following-sibling::ul")
List<WebElement> ChoosingDefaultPriceList;
@FindBy(xpath = "//input[@data-fieldname='territory']")
WebElement Territory;
@FindBy(xpath = "//input[@data-fieldname='territory']/following-sibling::ul")
List<WebElement> ChoosingTerritories;
@FindBy(xpath = "//input[@data-fieldname='print_language']")
WebElement PrintLanguage;
@FindBy(xpath = "//input[@data-fieldname='print_language']/following-sibling::ul")
List<WebElement> ChoosingLanguage;

// Personal and social history
@FindBy(xpath = "//div[contains(@class, 'collapsible-area') and .//span[text()='Personal and Social History']]")
WebElement ClickOnPersonalSection;
@FindBy(xpath = "//input[@data-fieldname='occupation']")
WebElement Occupation;
@FindBy(xpath = "//select[@data-fieldname='marital_status']")
WebElement MaritalStatusDropDown;

// Patient Relation Section
@FindBy(xpath = "//div[contains(@class, 'collapsible-area') and .//span[text()='Patient Relation']]")
WebElement ClickRelationSection;
@FindBy(xpath = "//div[contains(@class, 'grid-add-row')]//button[contains(@class, 'btn-primary')]")
WebElement AddRowButton;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//input[@data-fieldname='patient_name']")
WebElement PatientName2;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//select[@data-fieldname='relation']")
WebElement RelationDropDown2;
@FindBy(xpath = "//div[@class='grid-row-actions']//button[contains(@class, 'btn-edit')]")
WebElement ClickOnEditPatient;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//textarea[@data-fieldname='description']")
WebElement Description;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//button[contains(text(),'Save')]")
WebElement ClickingSave;

// Allergies, Medical and Surgical History
@FindBy(xpath = "//div[contains(@class, 'collapsible-area') and .//span[text()='Allergies, Medical and Surgical History']]")
WebElement AllergiesAndSurgicalHistory;
@FindBy(xpath = "//input[@data-fieldname='allergies']")
WebElement Allergies;
@FindBy(xpath = "//ul[contains(@class, 'awesomplete-auto')]//li[1]")
WebElement ChoosingAllergies;
@FindBy(xpath = "//textarea[@data-fieldname='surgical_history']")
WebElement SurgicalHistory;
@FindBy(xpath = "//textarea[@data-fieldname='medication']")
WebElement Medication;
@FindBy(xpath = "//textarea[@data-fieldname='gyne_and_obs_history']")
WebElement GyneAndOBSHistoryIncludingTheLMP;
@FindBy(xpath = "//textarea[@data-fieldname='medical_history']")
WebElement MedicalHistory;

// Risk Factors section
@FindBy(xpath = "//div[contains(@class, 'collapsible-area') and .//span[text()='Risk Factors']]")
WebElement ClickingRiskSection;
@FindBy(xpath = "//input[@data-fieldname='tobacco_consumption_past']")
WebElement TobaccoConsumptionPast;
@FindBy(xpath = "//input[@data-fieldname='tobacco_consumption_present']")
WebElement TobaccoConsumptionPresent;
@FindBy(xpath = "//input[@data-fieldname='alcohol_consumption_past']")
WebElement AlcoholConsumptionPast;
@FindBy(xpath = "//input[@data-fieldname='alcohol_consumption_present']")
WebElement AlcoholConsumptionPresent;
@FindBy(xpath = "//textarea[@data-fieldname='occupational_hazards_and_environmental_factors']")
WebElement OccupationalHazardsAndEnvironmentalFactors;
@FindBy(xpath = "//textarea[@data-fieldname='other_risk_factors']")
WebElement OtherRiskFactors;

// More Information Section
@FindBy(xpath = "//div[contains(@class, 'collapsible-area') and .//span[text()='More Information']]")
WebElement ClickingMoreInformation;
@FindBy(xpath = "//textarea[@data-fieldname='patient_details']")
WebElement PatientDetails;

// INSURANCE PLANS section
@FindBy(xpath = "//div[contains(@class, 'grid-add-row')]//button[contains(@class, 'btn-primary')]")
WebElement AddROWINSURANCEPLANS;
@FindBy(xpath = "//div[@class='grid-row-actions']//button[contains(@class, 'btn-edit')]")
WebElement ClickEditingPlan;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//input[@data-fieldname='insurance_plan']")
WebElement InsurancePlan;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//input[@data-fieldname='insurance_plan']/following-sibling::ul/li[1]")
WebElement ChoosingPlaneInsurance;
@FindBy(xpath = "//input[@data-fieldname='expiry_date']")
WebElement ExpiryDate;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//input[@data-fieldname='member_card_id']")
WebElement MemberCardID;
@FindBy(xpath = "//div[contains(@class, 'form-in-grid')]//button[contains(text(),'Save')]")
WebElement savingInsurance;

@FindBy(xpath = "//button[contains(text(), 'Save')]")
WebElement ClickingSavePatient;
@FindBy(className = "msgprint")
public WebElement AssertMandatory;
@FindBy(xpath = "//div[contains(@class, 'modal-dialog')]//div[@class='modal-body']")
public WebElement AssertDateOfBirthFormateValdation;
@FindBy(css = "input[data-fieldname='national_id']")
public WebElement FilteringByNationalId;
@FindBy(css = "input[data-fieldname='patient_name']")
public WebElement FilteringByFullName;
@FindBy(css = "input[data-fieldname='mobile']")
public WebElement FilteringByMobile;
@FindBy(css = "input[data-fieldname='email']")
public WebElement FilteringByEmail;
@FindBy(xpath = "//div[contains(@class, 'modal-footer')]//button[text()='Close']")
public WebElement clickCloseErrorMessageForMandatory;
@FindBy(xpath = "//div[contains(@class, 'modal-footer')]//button[text()='Close']")
public WebElement clickCloseErrorMessageForDateOfBarth;
@FindBy(xpath = "//span[contains(@class, 'list-count')]")
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
