package com.orderProcessing.service.bo.impl;

import java.io.Serializable;

import com.orderProcessing.service.Address;
import com.orderProcessing.service.bo.AddressBO;
import com.orderProcessing.service.dao.AddressDAO;

//@Service("addressBO")
public class AddressBOImpl implements AddressBO {


	private AddressDAO addressDAO;

	public AddressDAO getAddressDAO() {
		return addressDAO;
	}

	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}

	@Override
	public void save(Address domain) {
		addressDAO.save(domain);
	}

	@Override
	public void update(Address domain) {
		addressDAO.update(domain);
	}

	@Override
	public void delete(Address domain) {
		addressDAO.remove(domain);
	}

	@Override
	public Address get(Class<Address> clazz, Serializable id) {
		return addressDAO.get(clazz, id);
	}	
}
