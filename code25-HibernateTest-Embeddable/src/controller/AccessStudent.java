package controller;

import model.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;
import model.Address;
public class AccessStudent {

	public static void main(String[] args) {

		Address address = new Address();
		address.setNumber(130);
		address.setStreet("Biak na Bato");
		address.setZip("1100");
		address.setRegion("NCR");
		address.setCountry("Philippines");
		
		Student moniqa = new Student();
		moniqa.setLastName("Tumulak");
		moniqa.setFirstName("Moniqa Monique");
		moniqa.setYearLevel(3);
		moniqa.setCourse("BS in Computer Science");
		moniqa.setSection("3CSA");
		moniqa.setMale(false);
		moniqa.setDateEnrolled(new Date());
		moniqa.setAmbition("Forever maging coder. Forever bestfriend ni BESSHIE");
		moniqa.setAddress(address);
		
		address.setNumber(130);
		address.setStreet("Banawe");
		address.setZip("1100");
		address.setRegion("NCR");
		address.setCountry("Philippines");
		
		Student monique = new Student();
		monique.setLastName("Tumulak");
		monique.setFirstName("Monica Monique");
		monique.setYearLevel(3);
		monique.setCourse("BS in Computer Science");
		monique.setSection("3CSA");
		monique.setMale(false);
		monique.setDateEnrolled(new Date());
		monique.setAmbition("MAWAKNIK SI BESSHIE");
		monique.setAddress(address);
		
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
			
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(monique);
		session.save(moniqa);
		session.getTransaction().commit();
	}

}
