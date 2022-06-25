package org.sample;

import org.demo.LoginPage;
import org.demo.baseClass;
import org.hdemo.SearchHotel;
import org.hdemo.SelectHotel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 extends baseClass {
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
	//suite Exambles
	   
		@Test
		private void login() throws Exception {
			
			LoginPage l = new LoginPage();
		l.login(getData("login", 1, 0), getData("login", 1, 1));
		}
	
		@Test()
		private void search() throws Exception {
			SearchHotel sh = new  SearchHotel();
			sh.search(getData("Search", 1, 0), getData("Search", 1, 1), getData("Search", 1, 2), getData("Search", 1, 3), getData("Search", 1, 4), getData("Search", 1, 5), getData("Search", 1, 6),
					getData("Search", 1, 7));
		}

		@Test
		private void select() {
			SelectHotel sel = new SelectHotel();
			sel.select();

	
	
	
	
	
		}	
	

}
