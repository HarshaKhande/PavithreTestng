package Perfomanceexperts.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class groupingtestcases {
	
	
	@Test (groups = {"Sanity"})
	public void browsercommands() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harsha Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// launch the url

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();
		// driver.getTitle() - page title

		String title = driver.getTitle();

		System.out.println(title);

		// driver.getPagesource() - html source code

		String pagesrc = driver.getPageSource();

		System.out.println(pagesrc);

		// driver.getCurrentURL() - loaded url

		String crturl = driver.getCurrentUrl();

		System.out.println(crturl);

		// driver.close - close same session of the bwroser

		driver.close();

	}

	@Test (groups = {"Regression"})
	public void gettext() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harsha Patil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");

		driver.manage().window().maximize();

		WebElement inputfield = driver.findElement(By.xpath("//div[@id = 'content']"));

		String text = inputfield.getText();

		System.out.println(text);

	}


}
