package Perfomanceexperts.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallelexecutrion {
	
	@Test
	public void invokechrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harsha Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://www.geeksforgeeks.org/");
	}

	
	
	
	

}
