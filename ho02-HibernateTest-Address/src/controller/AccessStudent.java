package controller;

import model.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;
import model.Address;
public class AccessStudent {

	public static void main(String[] args) {

		Address homeA = new Address();
		homeA.setNumber(130);
		homeA.setStreet("Biak na Bato");
		homeA.setZip("1100");
		homeA.setCity("Quezon City");
		homeA.setRegion("NCR");
		homeA.setCountry("Philippines");
		
		Address schoolA = new Address();
		schoolA.setNumber(0);
		schoolA.setStreet("Espana");
		schoolA.setZip("1100");
		schoolA.setCity("Manila");
		schoolA.setRegion("NCR");
		schoolA.setCountry("Philippines");
		
		Student moniqa = new Student();
		moniqa.setLastName("Tumulak");
		moniqa.setFirstName("Moniqa Monique");
		moniqa.setYearLevel(3);
		moniqa.setCourse("BS in Computer Science");
		moniqa.setSection("3CSA");
		moniqa.setMale(false);
		moniqa.setDateEnrolled(new Date());
		moniqa.setAmbition("Forever maging coder. Forever bestfriend ni BESSHIE");
		moniqa.sethAddress(homeA);
		moniqa.setsAddress(schoolA);
		
//		address.setNumber(130);
//		address.setStreet("Banawe");
//		address.setZip("1100");
//		address.setRegion("NCR");
//		address.setCountry("Philippines");
//		
//		Student monique = new Student();
//		monique.setLastName("Tumulak");
//		monique.setFirstName("Monica Monique");
//		monique.setYearLevel(3);
//		monique.setCourse("BS in Computer Science");
//		monique.setSection("3CSA");
//		monique.setMale(false);
//		monique.setDateEnrolled(new Date());
//		monique.setAmbition("MAWAKNIK SI BESSHIE");
//		monique.setAddress(address);
		
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
			
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		session.save(monique);
		session.save(moniqa);
		session.getTransaction().commit();
	}

}
