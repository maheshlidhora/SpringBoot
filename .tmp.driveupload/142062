package com.jspders.ViaHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jspders.ViaHibernate.entity.User;

@SpringBootApplication
public class SpringBootProject5ViaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject5ViaHibernateApplication.class, args);
		Configuration cfg = new Configuration();
		cfg.configure("/com/jspders/ViaHibernate/config/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//    	FOR INTERSION;
//    	User user = new User();
//    	user.setFirstName("Vijay");
//    	user.setLastName("lal");
//    	user.setMobile(6785431290l);
//    	user.setCategory("Creatre");
//    	try {
//        	session.save(user);
//        	transaction.commit();
//        	System.out.println("USER ADDED SUCCESSFULLY!!");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//        	System.out.println("USER NOT ADDED!!");
//		}



//    	FOR UPDATION;
		try {
			User user = session.get(User.class, 1);
			if (user != null) {
				user.setFirstName("Ajay");
				session.save(user);
//				OR
//				session.saveOrUpdate(user);
	        	transaction.commit();
				System.out.println("USER UPDATED SUCCESSFULLY !!");
			} else {
				System.out.println("USER IS NOT PRESENT");
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			System.out.println("USER NOT FATCHED DUE TO SOME ERROR !!");
		}
		
//    	FOR SELECTION;
		try {
			User user = session.get(User.class, 1);
			if (user != null) {
				System.out.println(user.getId());
				System.out.println(user.getFirstName());
				System.out.println(user.getLastName());
				System.out.println(user.getMobile());
				System.out.println(user.getCategory());
			} else {
				System.out.println("USER IS NOT PRESENT");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("USER NOT FATCHED DUE TO SOME ERROR !!");
		}
		
	}
}