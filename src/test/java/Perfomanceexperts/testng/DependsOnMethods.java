package Perfomanceexperts.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	
	
	@Test (enabled = true)
	public void login() {

		System.out.println("Login testcase");
	}
	
	
	@Test(dependsOnMethods = "login")
	public void AddToCart() {

		System.out.println("Add to  cart testcase");
	}

}
