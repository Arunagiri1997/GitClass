package org.login;

import org.demo.Dpro;
import org.demo.LoginPage;
import org.demo.baseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelMethods  extends baseClass{
	
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
	
	
	    @Parameters ({"name","pass"})
		@Test
		private void login(String name, String pass) {
			LoginPage l = new LoginPage();
			l.login(name, pass);

		}
		
	@Test
	private void tc1() {
		System.out.println("test1");

	}
	
	
	
	
	

}
