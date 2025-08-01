package com.jspders.ViaHibernate.repositiory;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.jspders.ViaHibernate.config.HibernateConfig;
import com.jspders.ViaHibernate.entity.User;
@Repository
public class DBOperationsImpl implements DBOperations {

	@Override
	public User getUserDetails(int id) 
	{
		User user = null;
		try(Session session = HibernateConfig.getSessionFactory().openSession())
		{
			user = session.get(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("USER NOT FATCHED DUE TO SOME ERROR !!");
		}
		return user;
	}

//	FOR UPDATION;
//	try {
//		User user = session.get(User.class, 1);
//		if (user != null) {
//			user.setFirstName("Ajay");
//			session.save(user);
//			OR
//			session.saveOrUpdate(user);
//        	transaction.commit();
//			System.out.println("USER UPDATED SUCCESSFULLY !!");
//		} else {
//			System.out.println("USER IS NOT PRESENT");
//		}
//	} catch (Exception e) {
//		e.printStackTrace();
//		transaction.rollback();
//		System.out.println("USER NOT FATCHED DUE TO SOME ERROR !!");
//	}

//	FOR INTERSION;
//	User user = new User();
//	user.setFirstName("kaali");
//	user.setLastName("Gour");
//	user.setMobile(7867869542l);
//	user.setCategory("Viewer");
//	try(Session session = HibernateConfig.getSessionFactory().openSession())
//	{
//    	session.save(user);
//    	session.beginTransaction().commit();
//    	System.out.println("USER ADDED SUCCESSFULLY!!");
//	} 
//	catch (Exception e) 
//	{
//		HibernateConfig.getSessionFactory().openSession().beginTransaction().rollback();
//		e.printStackTrace();
//    	System.out.println("USER NOT ADDED!!");
//	}

}
