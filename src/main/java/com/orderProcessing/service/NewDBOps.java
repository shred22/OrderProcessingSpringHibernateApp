package com.orderProcessing.service;

import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orderProcessing.service.bo.CustomerOrderBO;

public class NewDBOps {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		//p1.setProductId(2);
		p1.setProductName("Benetton Shoes");
		p1.setProductCategory("Footwear");
		p1.setProductDescription("Comfy shoes");
		
		
		Product p2 = new Product();
		//p2.setProductId(3);
		p2.setProductName("Poster");
		p2.setProductCategory("Stationery");
		p2.setProductDescription("GOT Poster All Houses");
		
		Customer c = new Customer();
		c.setName("Alex John");
		c.setContactNo("7854714551");
		
		
		Address ad= new Address();
		//ad.setAddressId(202);
		ad.setCity("Indore");
		ad.setPincode("478520");
		ad.setState("MP");
		ad.setType("Home");
		ad.getCustomer().add(c);
		
		Address ad1= new Address();
		//ad1.setAddressId(203);
		ad1.setCity("Indore");
		ad1.setPincode("478520");
		ad1.setState("MP");
		ad1.setType("Home");
		ad1.getCustomer().add(c);
		
		CustomerOrder order = new CustomerOrder();
		//order.setOrderDate(new Date());
		order.setCustomer(c);
		order.getProduct().add(p1);
		order.getProduct().add(p2);
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
			
		CustomerOrderBO custOrderBO = (CustomerOrderBO) appContext.getBean("customerOrderBO"); 
		
		custOrderBO.save(order);
		
		System.out.println("Done");
		
		((AbstractApplicationContext) appContext).close();
		
	}

}
