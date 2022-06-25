package org.hrm;

import org.demo.baseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class oMain extends baseClass {
	
	
	@BeforeClass
	public static  void beforeClass() {
		browserLaunch();
		loadUrl("https://opensource-demo.orangehrmlive.com/");
		maximize();
	}
	@AfterClass
	
	public static void afterClass() {
browserLaunch();

	}
	
	
	@Test
public  void Tc1() throws Exception {

oLogin ol = new oLogin();
ol.loginPage(getData("oL", 1, 0), getData("oL", 1, 1));

}














	}


