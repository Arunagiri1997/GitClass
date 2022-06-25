package org.test;

import java.util.Date;

import org.demo.LoginPage;
import org.demo.baseClass;
import org.hdemo.OrderNumber;
import org.hdemo.SearchHotel;
import org.hdemo.SelectHotel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Testing extends baseClass{
	@BeforeClass
	public static void beforeClass() {
		browserLaunch();
		loadUrl("https://adactinhotelapp.com/");
		maximize();	




	}
	@AfterClass
	public static void afterClass() {
		browserClose();
	}
	@Before
	public void before() {
	Date d = new Date();
System.out.println(d);

	}
	@After
	public void after() {
Date  d  = new Date();
System.out.println(d);
	}
	 
	@Test
	public void TC1() throws Exception {
		LoginPage lp = new LoginPage();
		lp.login(getData("login", 1, 0), getData("login", 1, 1));

	}
	@Test
	public void TC2() throws Exception {
		SearchHotel sh = new  SearchHotel();
		sh.search(getData("Search", 1, 0), getData("Search", 1, 1), getData("Search", 1, 2), getData("Search", 1, 3), getData("Search", 1, 4),
				getData("Search", 1, 5), getData("Search", 1, 6), getData("Search", 1, 7));
	}

	@Test
	public void TC3() {

		SelectHotel sHot = new SelectHotel();
		sHot.select();
	}
	@Test
	public  void TC4() throws Exception {

		OrderNumber o = new OrderNumber();
		Thread.sleep(5000);
		WebElement getoNr = o.getoNr();
		System.out.println(getoNr);




	}









}
























