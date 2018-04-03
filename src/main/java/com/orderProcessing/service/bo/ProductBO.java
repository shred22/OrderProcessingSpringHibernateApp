package com.orderProcessing.service.bo;

import java.io.Serializable;
import java.util.List;

import com.orderProcessing.service.Product;

public interface ProductBO {

	void save(Product domain);
	
	void update(Product domain);
	
	void delete(Product domain);
	
	public Product get(Class<Product> clazz, Serializable id);
	
	public List<Product> getAllProducts();
	
}
