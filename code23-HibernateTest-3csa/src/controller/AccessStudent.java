package controller;

import model.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccessStudent {

	public static void main(String[] args) {
		Student rachel = new Student();
		rachel.setId("2014-073375");
		rachel.setLastName("Tumulak");
		rachel.setFirstName("Rachel Monique");
		rachel.setYearLevel(3);
		rachel.setCourse("BS in Computer Science");
		rachel.setSection("3CSA");
		rachel.setMale(true);
		
		Student Monique = new Student();
		Monique.setId("2014-173375");
		Monique.setLastName("Tumulak");
		Monique.setFirstName("Monica Monique");
		Monique.setYearLevel(3);
		Monique.setCourse("BS in Computer Science");
		Monique.setSection("3CSA");
		Monique.setMale(true);
		
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
			
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(rachel);
		session.getTransaction().commit();
	}

}
