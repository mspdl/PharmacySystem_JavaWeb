package com.pharmacy.main;

import org.hibernate.Session;

import com.pharmacy.util.HibernateUtil;

public class HibernateUtilTest {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();
		HibernateUtil.getSessionFactory().close();
	}

}
