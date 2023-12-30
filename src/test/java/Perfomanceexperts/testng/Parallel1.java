package Perfomanceexperts.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel1 {

	
	@Test
	public void invokeff() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Harsha Patil\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new FirefoxDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://www.geeksforgeeks.org/");
	}

}
