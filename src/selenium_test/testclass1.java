package selenium_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testclass1 {

	@Test
	void test() {
		System.setProperty("Webdriver.chrome.driver", "/sufianamara/chromedriver");
		WebDriver browser = new ChromeDriver();

	    //Firefox's proxy driver executable is in a folder already
	    //  on the host system's PATH environment variable.
	    browser.get("http://saucelabs.com");
	    WebElement header = browser.findElement(By.id("page-header"));
	    assertTrue((header.isDisplayed()));

	    browser.close(); 
	}

}
