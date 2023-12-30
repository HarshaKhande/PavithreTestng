package Perfomanceexperts.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizationeg {
	
	
	
	@Parameters("browser")
	@Test
	public void paramterizedmethod(String browser) {
		
		if (browser.equals("firefox")) {
			System.out.println("launch firefox");
			
			
		}else if (browser.equals("chrome")) {
			
			System.out.println("laucnh chrome");
		}
			
			
		
		
	}

}
