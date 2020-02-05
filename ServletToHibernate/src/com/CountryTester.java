package com;

import com.raksh.app.DAO.CountryDAO;
import com.raksh.app.DAO.CountryDAOimpl;
import com.raksh.app.Entity.CountryEntity;

public class CountryTester {

	public static void main(String[] args) {
		CountryEntity ce = new CountryEntity();
		ce.setCountryName("India");
		ce.setCountryContinent("Asia");
		ce.setPresident("Ram Nat Kovind");
		ce.setNoOfStates(29);
		
		CountryDAO dao = new CountryDAOimpl();
		dao.save(ce);
		System.out.println("saved");
		

	}

}
