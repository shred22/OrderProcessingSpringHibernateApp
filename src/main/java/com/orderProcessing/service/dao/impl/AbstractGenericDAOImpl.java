package com.orderProcessing.service.dao.impl;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.orderProcessing.service.dao.GenericDAO;

public abstract class AbstractGenericDAOImpl<T> implements GenericDAO<T> {

	@PersistenceContext(unitName="testPU")
	private EntityManager em;
	
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, readOnly=false, rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public T get(Class<T> clazz, Serializable id) {
		return em.find(clazz, id);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, readOnly=false, rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void update(T domain) {
		em.merge(domain);	
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, readOnly=false, rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void remove(T domain) {
		em.remove(domain);	
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, readOnly=false, rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void save(T domain) {
		em.persist(domain);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
