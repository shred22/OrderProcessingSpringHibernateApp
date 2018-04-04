package com.orderProcessing.service.bo.impl;

import java.io.Serializable;
import java.util.List;
import com.orderProcessing.service.Product;
import com.orderProcessing.service.bo.ProductBO;
import com.orderProcessing.service.dao.ProductDAO;

//@Service("productBO")
public class ProductBOImpl implements ProductBO {

	private ProductDAO productDao;
		
	public ProductDAO getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDAO productDao) {
		this.productDao = productDao;
	}

	@Override
	public void save(Product domain) {
		productDao.save(domain);	
	}

	@Override
	public void update(Product domain) {
		productDao.update(domain);	
	}

	@Override
	public void delete(Product domain) {
		productDao.remove(domain);
		
	}

	@Override
	public Product get(Class<Product> clazz, Serializable id) {
		return productDao.get(clazz, id);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}
}
