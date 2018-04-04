package com.orderProcessing.dao.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.orderProcessing.service.Address;

@ContextConfiguration(locations = "classpath:spring/config/BeanLocations-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AddressDAOTest extends TestBase {

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(AddressDAOTest.class);
	
	@Test
	@Rollback
	@Transactional
	public void canSaveAddress() {
		Address address = createAddressToPersist();
		addressDAO.save(address);
		LOG.info("********-Address Persisted****************"+address.getAddressId());
		Address address2 = addressDAO.get(Address.class, address.getAddressId());
		assertThat("Addres details not matching", address.getCity(), is(equalTo(address2.getCity())));	
	}
	
	@Test
	@Rollback
	@Transactional
	public void canGetAllAddress() {
	
		List<Address> all = addressDAO.findAll();

		assertThat(all, is(notNullValue()));
		LOG.info("*********Printing all Address : "+all.toString()+"**********");
	}
	
	
}
