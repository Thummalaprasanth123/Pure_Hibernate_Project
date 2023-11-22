package in.prasanth.client;

import in.prasanth.dao.CountryDAO;
import in.prasanth.dao.impl.CountryDAOImpl;
import in.prasanth.entity.Country;

public class Tester {

	public static void main(String[] args) {

		CountryDAO cDAO = new CountryDAOImpl();
		/*
		Country country = new Country();
        country.setSno("4");
        country.setCname("London");
        country.setCcode("LDN");
        cDAO.saveCountry(country);
        */
//		Country cou=cDAO.loadCountry("1");
//		Country cou=cDAO.loadCountry("1");
	cDAO.getCountryData();
//		System.out.println(cou);
//		Country c1=cDAO.updateCountry("4","LN");
//		System.out.println(c1);
//		cDAO.deleteCountry("4");
	}

}
