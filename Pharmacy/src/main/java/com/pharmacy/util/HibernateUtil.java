package com.pharmacy.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory = createSessionFactory();

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static SessionFactory createSessionFactory() {
		try {
			Configuration configuration = new Configuration().configure(); // search for configurations in the
																			// hibernate.cfg.xml file
			ServiceRegistry register = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
					.build();

			SessionFactory factory = configuration.buildSessionFactory();

			return factory;

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed. " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

}
