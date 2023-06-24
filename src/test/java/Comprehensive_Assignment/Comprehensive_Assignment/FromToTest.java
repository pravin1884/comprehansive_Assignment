package Comprehensive_Assignment.Comprehensive_Assignment;

public class FromToTest {
	public static void fromToValidation() {
	chromedriver_path = '/path/to/chromedriver'

			class Browser:
			    def __init__(self, driver_path):
			        # Create a Chrome webdriver instance
			        self.driver = webdriver.Chrome(executable_path=driver_path)
			        self.wait = WebDriverWait(self.driver, 10)
			    
			    def get_element(self, locator):
			        return self.wait.until(EC.visibility_of_element_located(locator))
			    
			    def click_element(self, locator):
			        element = self.get_element(locator)
			        element.click()
			    
			    def enter_text(self, locator, text):
			        element = self.get_element(locator)
			        element.clear()
			        element.send_keys(text)
			    
			    def close(self):
			        # Close the browser
			        self.driver.quit()




			# Create an instance of the Browser class
			browser = Browser(chromedriver_path)

			# Launch Chrome browser and navigate to MakeMyTrip website
			browser.driver.get("https://www.makemytrip.com/")

			# Click on the "Flights" tab
			browser.click_element((By.XPATH, "//li[@data-cy='menu_Flights']"))

			# Click on the "OneWay" option
			browser.click_element((By.XPATH, "//li[@data-cy='oneWayTrip']"))

			# Enter the "FROM" location
			browser.enter_text((By.XPATH, "//input[@id='fromCity']"), "New York")

			# Enter the "TO" location
			browser.enter_text((By.XPATH, "//input[@id='toCity']"), "Los Angeles")

			# Close the browser
			browser.close()




}
}
