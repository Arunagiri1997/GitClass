package org.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser extends baseClass {
	
	
	@Parameters({"browserName"})
	@Test
	private void tc1(String browserName) {
		
		if(browserName.equals("chrome")) {
			chromebrowserLaunch();
		}else if (browserName.equals("firefox")) {
			firefoxBrowserLaunch();		
		}else if(browserName.equals("edge")) {
			
			edgeBrowserLaunch();
		}
		loadUrl("https://adactinhotelapp.com/");
	
	

				LoginPage l = new LoginPage();
				l.login("arunagiri123", "8220861943adak");

		 
		
		
		

	}
	
	
	
	
	
	

}
