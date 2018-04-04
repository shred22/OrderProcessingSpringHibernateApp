package com.orderProcessing.service.bo.impl;

import java.io.Serializable;
import com.orderProcessing.service.CustomerOrder;
import com.orderProcessing.service.bo.CustomerOrderBO;
import com.orderProcessing.service.dao.CustomerOrderDAO;

//@Service("customerOrderBO")
public class CustomerOrderBOImpl implements CustomerOrderBO {

	private CustomerOrderDAO custOrderDAO;
	
	public CustomerOrderDAO getCustOrderDAO() {
		return custOrderDAO;
	}

	public void setCustOrderDAO(CustomerOrderDAO custOrderDAO) {
		this.custOrderDAO = custOrderDAO;
	}

	@Override
	public void save(CustomerOrder domain) {
		custOrderDAO.save(domain);
	}

	@Override
	public void update(CustomerOrder domain) {
		custOrderDAO.update(domain);
	}

	@Override
	public void delete(CustomerOrder domain) {
		custOrderDAO.remove(domain);
	}

	@Override
	public CustomerOrder get(Class<CustomerOrder> clazz, Serializable id) {
		return custOrderDAO.get(clazz, id);
	}	
}
