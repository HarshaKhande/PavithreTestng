package Perfomanceexperts.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsEg {

	@BeforeSuite
	
	public void beforesuitemethod() {

		System.out.println("Before suite");
	}

	@BeforeTest
	@Test
	public void beforetestmethod() {

		System.out.println("Before test");
	}

	@BeforeClass
	@Test
	public void beforeclassmethod() {

		System.out.println("Before class");
	}

	@BeforeMethod
	@Test
	public void beforemethod() {

		System.out.println("Before method");
	}
	
	@Test
	public void testcase1() {
		
		System.out.println("Testcase 1");
	}
	
	@Test
	public void testcase2() {
		
		System.out.println("Testcase 2");
	}
	

	@AfterMethod
	@Test
	public void aftermethod() {

		System.out.println("after method");
	}
	

	@AfterClass
	@Test
	public void afterclassmethod() {

		System.out.println("after class");
	}

	@AfterTest
	@Test
	public void aftertestmethod() {

		System.out.println("after test");
	}


	
	
	@AfterSuite
	@Test
	public void aftersuitemethod() {

		System.out.println("after suite");
	}

	
}
