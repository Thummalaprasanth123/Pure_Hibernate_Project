package in.prasanth.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import in.prasanth.dao.CountryDAO;
import in.prasanth.entity.Country;

public class CountryDAOImpl implements CountryDAO {

	SessionFactory factory;

	public CountryDAOImpl() {
		ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build();
		factory=metadata.getSessionFactoryBuilder().build();
	}

	@Override
	public void saveCountry(Country country) {
          Session session=factory.openSession();
          Transaction t=session.beginTransaction();	
          try {
        	  session.save(country);
        	  System.out.println("Country object is persisted in database");
        	  t.commit();
          }
          catch(Exception ex)
          {
        	  t.rollback();
        	  System.out.println("Issue in persisting country object");
        	  System.out.println(ex);
          }
          finally
          {
        	  session.close();
        	 // factory.close();
          
          }
	}

	@Override
	public Country loadCountry(String sno) {
		Session session=factory.openSession();
		Country cu=session.load(Country.class,sno);
		Country co=session.load(Country.class,sno);
		Country c3=session.load(Country.class,sno);
		System.out.println(cu.getCname());
		session.close();
		return cu;
	}
	@Override
	public void getCountryData() {
		Session session=factory.openSession();
		Session other_session=factory.openSession();
		Country c4=session.get(Country.class,1);
		//Country c5=session.get(Country.class,2);
//		session.evict(c4);
		Country c6=session.get(Country.class,1);
		session.clear();
		Country c7=session.get(Country.class,1);
		//Country c7=other_session.get(Country.class,3);
		//System.out.println(cu.getCname());
		//session.evict(c5);
		session.close();
		other_session.close();
	}
 
	@Override
	public Country updateCountry(String sno, String ccode) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Country cu=session.get(Country.class,sno);
		
		cu.setCcode(ccode);
		session.update(cu);
		t.commit();
		System.out.println("Updated successfully");
		session.close();
		return cu;
	}

	@Override
	public void deleteCountry(String sno) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Country cu=session.get(Country.class, sno);
		session.delete(cu);
		t.commit();
		System.out.println("Deleted Successfully");
	}

	
}












