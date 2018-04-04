package com.orderProcessing.service.bo;

import java.io.Serializable;

import com.orderProcessing.service.Address;

public interface AddressBO {
	
	void save(Address domain);

	void update(Address domain);

	void delete(Address domain);

	public Address get(Class<Address> clazz, Serializable id);

}
