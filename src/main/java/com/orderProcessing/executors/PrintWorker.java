package com.orderProcessing.executors;

import java.util.concurrent.Callable;

import customerOrderXSDClasses.CustomerOrder;

public class PrintWorker implements Callable<String> {

	private CustomerOrder order;
	public PrintWorker() {
		super();
	}

	public PrintWorker(CustomerOrder order) {
		super();
		this.order = order;
	}

	@Override
	public String call() throws Exception {
		System.out.println("PrintWorker Thread executing..!!");
		System.out.println("CustomerDO Name : "+order.getCustomer().getName());
		System.out.println("Contact No : "+order.getCustomer().getContactNo());
		System.out.println("City :  "+order.getCustomer().getAddress().getCity());	
		return "Done..!!";
	}
}
