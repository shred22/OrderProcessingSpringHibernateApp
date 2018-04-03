package com.orderProcessing.service.dao.impl;

import java.util.List;

import com.orderProcessing.service.Product;
import com.orderProcessing.service.dao.ProductDAO;

public class ProductDAOImpl extends AbstractGenericDAOImpl<Product> implements ProductDAO {
	@Override
	public List<Product> findAll() {
		return getEm().createNamedQuery("getAllProduct").getResultList();
		//return  getEm().createQuery( "SELECT p FROM Product p").getResultList();
	}
}
