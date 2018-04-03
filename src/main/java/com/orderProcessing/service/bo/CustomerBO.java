package com.orderProcessing.service.bo;

import java.io.Serializable;

import com.orderProcessing.service.Customer;

public interface CustomerBO {

	void save(Customer domain);

	void update(Customer domain);

	void delete(Customer domain);

	public Customer get(Class<Customer> clazz, Serializable id);
}
