package Comprehensive_Assignment.Comprehensive_Assignment;

import org.testng.annotations.Test;


public class LogoTest {
	@Test
	public static void logoPresentOrNot(){
	firefox_driver_path = '/path/to/geckodriver'

			# Launch Firefox browser
			driver = webdriver.Firefox(executable_path=firefox_driver_path)

			# Navigate to MakeMyTrip website
			driver.get('https://www.makemytrip.com/')

			# Verify the presence of the MakeMyTrip logo
			logo_element = driver.find_element_by_xpath('//img[@class="makeFlex"]')
			if logo_element.is_displayed():
			    print("MakeMyTrip logo is present on the page.")
			else:
			    print("MakeMyTrip logo is not present on the page.")

			# Close the browser
			driver.quit()

	

}
}
