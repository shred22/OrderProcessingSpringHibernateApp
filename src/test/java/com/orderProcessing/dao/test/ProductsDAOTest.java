package com.orderProcessing.dao.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orderProcessing.service.Address;
import com.orderProcessing.service.Customer;
import com.orderProcessing.service.CustomerOrder;
import com.orderProcessing.service.Product;
import com.orderProcessing.service.dao.impl.AbstractGenericDAOImpl;
import com.orderProcessing.service.dao.impl.ProductDAOImpl;


public class ProductsDAOTest {
	
	public static void main(String  args[]) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
			
		Address address = new Address.AddressBuilder()
		.withCity("Indore")
		.withPincode("452016")
		.withState("MP")
		.withType("Home").build();
		
		Customer cust = new Customer.CustomerBuilder().
				withContactNo("8957415771")
				.withName("Jay").build();
		
		CustomerOrder  order = new CustomerOrder.CustomerOrderBuilder()
		.withCustomer(cust)	
		.withOrderDate(new Date()).build();
		
		
		Product product = new Product.ProductBuilder()
		.withProductCategory("Electronics")
		.withProductDescription("Mi 200 Mah Power Bank")
		.withProductId(1)
		.withProductName("Power Bank").build();
		
		/*product.setOrder(order);
		order.setProduct(product);
		address.setCustomer(cust);
		cust.setOrder(order);
		cust.setAddress(address);*/
		
		ProductDAOImpl dao = new ProductDAOImpl();
		AbstractGenericDAOImpl bean = (AbstractGenericDAOImpl)appContext.getBean("productBO");
		
		if(bean != null) {
			System.out.println("Got it");
		}
		
		((AbstractApplicationContext)appContext).close();
		
	
	}

}
