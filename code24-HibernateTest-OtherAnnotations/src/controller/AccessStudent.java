package controller;

import model.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class AccessStudent {

	public static void main(String[] args) {
		Student moniqa = new Student();
		moniqa.setLastName("Tumulak");
		moniqa.setFirstName("Moniqa Monique");
		moniqa.setYearLevel(3);
		moniqa.setCourse("BS in Computer Science");
		moniqa.setSection("3CSA");
		moniqa.setMale(false);
		moniqa.setDateEnrolled(new Date());
		moniqa.setAmbition("Forever maging coder. Forever bestfriend ni BESSHIE");
		
		Student monique = new Student();
		monique.setLastName("Tumulak");
		monique.setFirstName("Monica Monique");
		monique.setYearLevel(3);
		monique.setCourse("BS in Computer Science");
		monique.setSection("3CSA");
		monique.setMale(false);
		monique.setDateEnrolled(new Date());
		monique.setAmbition("MAWAKNIK SI BESSHIE");
		
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
			
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(monique);
		session.save(moniqa);
		session.getTransaction().commit();
	}

}
