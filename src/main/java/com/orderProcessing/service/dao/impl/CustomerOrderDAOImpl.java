package com.orderProcessing.service.dao.impl;

import java.util.List;

import com.orderProcessing.service.CustomerOrder;
import com.orderProcessing.service.dao.CustomerOrderDAO;


public class CustomerOrderDAOImpl extends AbstractGenericDAOImpl<CustomerOrder> implements CustomerOrderDAO {
	@Override
	public List<CustomerOrder> findAll() {
		List<CustomerOrder> resultList = getEm().createQuery( "SELECT p FROM CustomerOrder p").getResultList();
		return resultList;
		
	}
}
