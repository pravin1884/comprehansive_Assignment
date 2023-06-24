package Comprehensive_Assignment.Comprehensive_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeMyTripTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the Firefox driver executable
        System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
        
        // Launch Firefox browser
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyMakeMyTripLogoPresence() {
        // Navigate to MakeMyTrip website
        driver.get("https://www.makemytrip.com/");

        // Find the MakeMyTrip logo element
        WebElement logoElement = driver.findElement(By.xpath("//img[@class='makeFlex']"));

        // Verify the presence of the MakeMyTrip logo
        Assert.assertTrue(logoElement.isDisplayed(), "MakeMyTrip logo is present on the page.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}



