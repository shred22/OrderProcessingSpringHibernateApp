package com.orderProcessing.executors;

import java.util.concurrent.Callable;

import com.orderProcessing.models.ProductsDO;

import customerOrderXSDClasses.CustomerOrder;

public class ProductIdFetcher implements Callable<ProductsDO> {
	
	public ProductIdFetcher(CustomerOrder order) {
		super();
		
	}
	@Override
	public ProductsDO call() throws Exception {
		System.out.println("Fetching Product From Callable Thread");
		//TODO: Functionality To be implemented
		return null;
	}
	

}
