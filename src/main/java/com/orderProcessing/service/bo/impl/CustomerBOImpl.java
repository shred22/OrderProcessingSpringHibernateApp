package com.orderProcessing.service.bo.impl;

import java.io.Serializable;

import com.orderProcessing.service.Customer;
import com.orderProcessing.service.bo.CustomerBO;
import com.orderProcessing.service.dao.CustomerDAO;

public class CustomerBOImpl implements CustomerBO {

	private CustomerDAO customerDAO;
	
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public void save(Customer domain) {
		customerDAO.save(domain);

	}

	@Override
	public void update(Customer domain) {
		customerDAO.update(domain);
	}

	@Override
	public void delete(Customer domain) {
		customerDAO.remove(domain);
	}

	@Override
	public Customer get(Class<Customer> clazz, Serializable id) {
		return customerDAO.get(Customer.class, id);
	}

}
