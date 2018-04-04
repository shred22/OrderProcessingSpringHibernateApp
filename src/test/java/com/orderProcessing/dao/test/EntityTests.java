package com.orderProcessing.dao.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.orderProcessing.service.Address;
import com.orderProcessing.service.Customer;
import com.orderProcessing.service.CustomerOrder;
import com.orderProcessing.service.Product;


/**
 * 
 * @author shreyas
 *
 * TODO: The entire test Framework needs to modified to DAO tests intead of Entity tests
 */

public class EntityTests {
	private SessionFactory factory;
	private Session session = null;

	@Before
	public void before() {
	/*	// setup the session factory
		System.out.println("********************Executing @Before annotated method from JUnit framework**********************************\n\n");
		Configuration configuration = new Configuration()
				.configure(CustomerService.class.getResource("/hibernate.test.cfg.xml"));

		configuration.configure();

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		factory = configuration.buildSessionFactory(serviceRegistry);

		session = factory.openSession();*/
	}

	@Test
	public void canProductsBePersistedSuccessfully() {

		Product product = new Product();
		product.setProductId(1);
		product.setProductCategory("Clothing");
		product.setProductDescription("Mens Clothing");
		product.setProductName("Levis shirt");
	//	product.setOrder(null);

		session.getTransaction().begin();
		session.persist(product);
		
		Product products = (Product)session.get(Product.class, 1);

		assertThat("Clothing", equalTo(products.getProductCategory()));
		assertThat("Mens Clothing", equalTo(products.getProductDescription()));
		
		
		session.getTransaction().commit();
		System.out.println("Persisted Successfully a product");
	}
	@Test
	public void canCustomersBePersistedSuccessfully() {

		Customer cust = new Customer.CustomerBuilder()
		.withName("Akanksha S")
		.withContactNo("9827105770")
		.build();

		session.getTransaction().begin();
	
		int customerId = (Integer)session.save(cust);
		System.out.println("Customer with ID : "+customerId+"Persisted !!");
		
		session.getTransaction().commit();
		
		session.getTransaction().begin();
		
		Customer customer = (Customer)session.get(Customer.class, 1);

		assertThat("Akanksha S", equalTo(customer.getName()));
		assertThat("9827105770", equalTo(customer.getContactNo()));
		
		
		session.getTransaction().commit();
		System.out.println("Persisted Successfully a customer");
	}
	@Test
	public void canAddressBePersistedSuccessfully() {

		Customer cust = new Customer.CustomerBuilder()
		.withName("Akanksha S")
		.withContactNo("9827105770")
		.build();
		
		Address address = new Address.AddressBuilder()
		.withCity("Indore")
		.withPincode("452016")
		.withState("M.P")
		.withType("Home")
		.build();

	//	cust.setAddress(address);
	//	address.setCustomer(cust);
		
		session.getTransaction().begin();
	
		session.persist(cust);
		int addressId = (Integer)session.save(address);
		
		System.out.println("Address with ID : "+addressId+" Persisted !!");
		
		session.getTransaction().commit();
		
		session.getTransaction().begin();
		
		Address addressInDB = (Address)session.get(Address.class, addressId);

		assertThat("Indore", equalTo(addressInDB.getCity()));
		assertThat("Home", equalTo(addressInDB.getType()));
		
		//assertThat("9827105770", equalTo(addressInDB.getCustomer().getContactNo()));
		session.getTransaction().commit();
		System.out.println("Persisted Successfully a Address");
	}

	@Test
	public void canCustomerOrderBePersistedSuccessfully() {

		Customer cust = new Customer.CustomerBuilder()
		.withName("Akanksha S")
		.withContactNo("9827105770")
		.build();
		
		Address address = new Address.AddressBuilder()
		.withCity("Indore")
		.withPincode("452016")
		.withState("M.P")
		.withType("Home")
		.build();
		
		//cust.setAddress(address);
		//address.setCustomer(cust);
		
		
		
		Product product = new Product();
		product.setProductId(1);
		product.setProductCategory("Clothing");
		product.setProductDescription("Mens Clothing");
		product.setProductName("Levis shirt");
		

		CustomerOrder custOrder = new CustomerOrder.CustomerOrderBuilder()
				.withOrderDate(new Date())
				.build();
		
		
		
		custOrder.setCustomer(cust);
		//cust.setOrder(custOrder);
				
		
		//custOrder.setProduct(product);
		//product.setOrder(custOrder);

		session.getTransaction().begin();
	
		session.persist(cust);
		session.persist(product);
		session.persist(address);
		
		int custOrderId = (Integer)session.save(custOrder);
		
		System.out.println("CustomerOrderBO with ID : "+custOrderId+" Persisted !!");
		
		session.getTransaction().commit();
		
		session.getTransaction().begin();
		
		CustomerOrder customerOrderInDB = (CustomerOrder)session.get(CustomerOrder.class, custOrderId);

		//assertThat("Indore", equalTo(customerOrderInDB.getCustomer().getAddress().getCity()));
		//assertThat("Clothing", equalTo(customerOrderInDB.getProduct().getProductCategory()));
		assertNotNull(customerOrderInDB.getOrderDate());
		
		
		session.getTransaction().commit();
		System.out.println("\n\nPersisted Successfully a CustomerOrderBO\n\n");
	}
	
	
	/*@Test
	public void canGetProductById() {
		
		CustomerService.createProductsinDB();
		
		session.getTransaction().begin();
		
		Product product = (Product)session.load(Product.class, 2);
		
		session.getTransaction().commit();
		
		assertThat("Womens Benetton Sneakers", equalTo(product.getProductName()));
		
	}*/
	
	@After
	public void after() {
		System.out.println("\n\n*************Executing @After annotated method from JUnit framework********\n\n");
		session.close();
		factory.close();
	}
}
