
import java.util.Date;

import org.demo.LoginPage;
import org.demo.baseClass;
import org.hdemo.OrderNumber;
import org.hdemo.SearchHotel;
import org.hdemo.SelectHotel;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeNG extends baseClass {

	@BeforeClass
	private void beforeClass() {
		browserLaunch();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		String title = driver.getTitle();
		

	}

	@AfterClass
	private void afterClass() {

		browserClose();
	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	private void afterTime() {
		Date d = new Date();
		System.out.println(d);

	}
    
	@Test
	private void login() throws Exception {
		
		LoginPage l = new LoginPage();
		l.login(getData("login", 1, 0), getData("login", 1, 1));

	}

	@Test
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
