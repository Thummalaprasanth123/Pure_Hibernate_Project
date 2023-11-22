package in.prasanth.dao;

import in.prasanth.entity.Country;

public interface CountryDAO {
	void saveCountry(Country country);
	Country loadCountry(String sno);
	void getCountryData();
	Country updateCountry(String sno, String ccode);
	void deleteCountry(String sno);
}
