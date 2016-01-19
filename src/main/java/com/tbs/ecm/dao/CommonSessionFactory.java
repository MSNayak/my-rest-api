package com.tbs.ecm.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonSessionFactory {
    @Autowired
	private SessionFactory mySessionFactory;

	protected Session getCurrentSession() {
		return mySessionFactory.getCurrentSession();
	}

	protected Session openSession() {
		return mySessionFactory.openSession();
	}
}
