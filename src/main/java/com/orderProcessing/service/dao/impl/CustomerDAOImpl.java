package com.orderProcessing.service.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.orderProcessing.service.Customer;
import com.orderProcessing.service.dao.CustomerDAO;

public class CustomerDAOImpl extends AbstractGenericDAOImpl<Customer> implements CustomerDAO {

	@Override
	@Transactional
	public List<Customer> findAll() {
		List<Customer> resultList = getEm().createQuery( "SELECT p FROM Customer p").getResultList();
		return resultList;
	}

}
