package com.tbs.ecm.dao.impl;

import java.io.Serializable;

import com.tbs.ecm.dao.CommonSessionFactory;
import com.tbs.ecm.dao.SuperDao;


public class SuperDaoImpl<T, PK extends Serializable> extends
		CommonSessionFactory implements SuperDao<T, PK> {

	private Class<T> type;

	public SuperDaoImpl(Class<T> type) {
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	@Override
	public PK insert(T newInstance) {
		return (PK) getCurrentSession().save(newInstance);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(PK id) {
		return (T) getCurrentSession().get(type, id);
	}

	@Override
	public void update(T transientObject) {
		getCurrentSession().update(transientObject);
	}
   
}
