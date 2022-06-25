package org.login;

import org.demo.LoginPage;
import org.demo.baseClass;
import org.hdemo.SearchHotel;
import org.hdemo.SelectHotel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tpara extends baseClass {
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

	// parameter Exambles
	@Parameters({ "userName", "password" })
	@Test
	private void login(String name, String pass) {
		LoginPage l = new LoginPage();
		l.login(name, pass);

	}

	@Parameters({ "location", "hotels", "roomType", "nor", "cid", "cod", "apr", "cpr" })
	@Test
	private void search(String location, String hotel, String rt, String nor, String cid, String cod, String apr,
			String cpr) {
		SearchHotel sh = new SearchHotel();
		sh.search(location, hotel, rt, nor, cid, cod, apr, cpr);

	}

	@Test
	private void select() {
		SelectHotel sel = new SelectHotel();
		sel.select();

	}

}
