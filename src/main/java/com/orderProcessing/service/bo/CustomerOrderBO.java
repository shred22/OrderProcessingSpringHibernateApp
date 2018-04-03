package com.orderProcessing.service.bo;

import java.io.Serializable;
import com.orderProcessing.service.CustomerOrder;

public interface CustomerOrderBO {

	void save(CustomerOrder domain);

	void update(CustomerOrder domain);

	void delete(CustomerOrder domain);

	public CustomerOrder get(Class<CustomerOrder> clazz, Serializable id);

}
