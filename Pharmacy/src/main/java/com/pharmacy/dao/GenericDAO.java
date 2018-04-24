package com.pharmacy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pharmacy.util.HibernateUtil;

public class GenericDAO<Entity> {

	public void save(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} catch (RuntimeException error) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw error;
		}
		
		finally {
			session.close();
		}
		
	}

}
