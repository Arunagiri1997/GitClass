package org.login;

import org.demo.LoginPage;
import org.demo.baseClass;
import org.hdemo.BookHotel;
import org.hdemo.OrderNumber;
import org.hdemo.SearchHotel;
import org.hdemo.SelectHotel;
import org.testng.annotations.Test;

public class Main {
	
	public static void main(String[] args) throws Exception {

		baseClass b = new baseClass();
		b.browserLaunch();
		b.loadUrl("https://adactinhotelapp.com/");
		b.maximize();
		LoginPage l = new LoginPage();
		l.login(b.getData("login", 1, 0), b.getData("login", 1, 1));
		SearchHotel sh = new SearchHotel();
		sh.search(b.getData("Search", 1, 0),b.getData("Search", 1, 1), b.getData("Search", 1, 2), b.getData("Search",1, 3), b.getData("Search", 1, 4),
				b.getData("Search", 1, 5), b.getData("Search", 1, 6), b.getData("Search", 1, 7));
		SelectHotel selhotel = new SelectHotel();
		selhotel.select();
		BookHotel bh = new BookHotel();
		bh.TC4(b.getData("BookHotel", 1, 0),b.getData("BookHotel", 1, 1),b.getData("BookHotel", 1, 2), b.getData("BookHotel",1, 3),b.getData("BookHotel", 1, 4),b.getData("BookHotel", 1, 5), b.getData("BookHotel", 1, 6), 
				b.getData("BookHotel", 1, 7));











	}

















}













