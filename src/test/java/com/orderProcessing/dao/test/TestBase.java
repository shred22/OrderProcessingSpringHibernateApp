package com.orderProcessing.dao.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.orderProcessing.service.Address;
import com.orderProcessing.service.dao.AddressDAO;

public class TestBase {

	@Autowired
	protected AddressDAO addressDAO;
	
	protected Address createAddressToPersist() {
		Address ad =new Address();
		ad.setCity("NY");
		ad.setPincode("452016");
		ad.setState("MP");
		ad.setType("Home");		
		return ad;
	}

	public AddressDAO getAddressDAO() {
		return addressDAO;
	}

	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}
	
}
