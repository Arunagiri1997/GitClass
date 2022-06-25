package org.demo;

import org.testng.annotations.DataProvider;

public class Dpro {
	

	@DataProvider(name="res")
	public Object[][] dataP() {
		Object [][]data = new Object [][] {
			
			{"anadak","123"},
			{"adakan1997","123456"},
			{"arunagiri123","8220861943adak"}
			
		};
	
		return data;
		
		
		

	}
	
	
	
	
	
	
	
	

}
