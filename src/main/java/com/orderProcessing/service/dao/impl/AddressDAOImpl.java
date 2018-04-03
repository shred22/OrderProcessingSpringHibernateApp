package com.orderProcessing.service.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.orderProcessing.service.Address;
import com.orderProcessing.service.dao.AddressDAO;


public class AddressDAOImpl extends AbstractGenericDAOImpl<Address> implements AddressDAO {

	@Override
	@Transactional
	public List<Address> findAll() {
		List<Address> resultList = getEm().createQuery( "SELECT p FROM Address p").getResultList();
		return resultList;
		
	}
	
}
