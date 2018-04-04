package com.orderProcessing.resources;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.ExecutionException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orderProcessing.service.Product;
import com.orderProcessing.service.bo.AddressBO;
import com.orderProcessing.service.bo.CustomerBO;
import com.orderProcessing.service.bo.CustomerOrderBO;
import com.orderProcessing.service.bo.ProductBO;

import customerOrderXSDClasses.CustomerOrder;
import customerOrderXSDClasses.CustomerOrder.Customer;
import customerOrderXSDClasses.CustomerOrder.Customer.Address;

@Path("/acceptOrder")
public class CustomerOrderResource {
	
	private CustomerOrderBO customerOrderBO;
	
	private CustomerBO customerBO;

	private ProductBO productBO;
	
	@Autowired
	private AddressBO addressBO;
	
	public AddressBO getAddressBO() {
		return addressBO;
	}

	public void setAddressBO(AddressBO addressBO) {
		this.addressBO = addressBO;
	}

	public ProductBO getProductBO() {
		return productBO;
	}

	public void setProductBO(ProductBO productBO) {
		this.productBO = productBO;
	}

	public CustomerOrderBO getCustomerOrderBO() {
		return customerOrderBO;
	}

	public void setCustomerOrderBO(CustomerOrderBO customerOrderBO) {
		this.customerOrderBO = customerOrderBO;
	}
	

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/post")
	public String sayHello(String str)  {
		return "Hello User : "+str;
	}
	

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerOrder.Customer acceptCustomerOrder(CustomerOrder order) throws ParseException, InterruptedException, ExecutionException {
				
		Customer customer = order.getCustomer();
		String orderdate = order.getOrderdate();
		/**
		 * TODO: CustomerService To be modified to include <expedite> element from payload
		 */
		//String expedite = order.getExpedite();
		
		Address address = customer.getAddress();
		String contactNo = customer.getContactNo();
		String emailId = customer.getEmailId();
		String name = customer.getName();
		String productId = customer.getProductId();
				
		com.orderProcessing.service.CustomerOrder co = new com.orderProcessing.service.CustomerOrder();
		com.orderProcessing.service.Customer cust = new com.orderProcessing.service.Customer();
		com.orderProcessing.service.Address addr = new com.orderProcessing.service.Address();
		
		addr.setCity(address.getCity());
		addr.setPincode(address.getPincode());
		addr.setState(address.getState());
		addr.setType(address.getType());
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		addressBO = (AddressBO)ctx.getBean("addressBO");
		
		
		cust.setContactNo(contactNo);
		cust.setName(name);
		cust.setEmailId(emailId);
		cust.getAddress().add(addr);
		addr.getCustomer().add(cust);

		Date date = new Date(orderdate);
		
		co.setCustomer(cust);
		co.setOrderDate(date);
					
		
		productBO = (ProductBO) ctx.getBean("productBO");
		customerOrderBO = (CustomerOrderBO) ctx.getBean("customerOrderBO");
		customerBO = (CustomerBO) ctx.getBean("customerBO");
		
		Product product = productBO.get(Product.class, Integer.parseInt(productId));
		
		co.getProduct().add(product);
		
		System.out.println("Got Product : "+product.getProductCategory()+" id : "+product.getProductId());
		
		addressBO.save(addr);
		customerBO.update(cust);
		
		customerOrderBO.update(co);
		((AbstractApplicationContext)ctx).close();
		return order.getCustomer();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getProductId() {
		return "Dummy GET method invoked";
	}

	public CustomerBO getCustomerBO() {
		return customerBO;
	}

	public void setCustomerBO(CustomerBO customerBO) {
		this.customerBO = customerBO;
	}
	
}
