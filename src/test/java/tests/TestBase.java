package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import utilities.Helper;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public void setEnvironmentVariables() {
        // Add more environment variables as needed
        Allure.addAttachment("Environment", "QA");
        Allure.addAttachment("Browser", "Chrome");

    }

    @BeforeSuite
    @Parameters({"browser"})

    public void startDriver() {

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("http://dev.advintic.com:3321/#login");
    }

    @AfterSuite
    public void stopDriver() {
        // driver.quit();
    }

    // take screenshot when test case fails and add it in the Screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(driver, result.getName());
            Helper.attachScreenshotToAllure(result.getName()); // Attach screenshot to Allure report
        }
    }
}
