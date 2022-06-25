package org.demo;

import org.hdemo.SearchHotel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data extends baseClass {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch();
		maximize();
		loadUrl("https://adactinhotelapp.com/");

	}

	@AfterClass
	private void afterClass() {
		browserClose();

	}
		@Test(dataProvider="res",dataProviderClass=Dpro.class)
		private void login(String name, String pass) {
			LoginPage l = new LoginPage();
			l.login(name, pass);

		}
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	


