package com.orderProcessing.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerDO {

	private String name;
	private String contactNo;
	private AddressDO address;
	private CustomerOrderDO order;
	public AddressDO getAddress() {
		return address;
	}

	public void setAddress(AddressDO address) {
		this.address = address;
	}

	public CustomerDO() {}
	
	public CustomerDO(CustomerDOBuilder builder) {
		this.name = builder.getName();
		this.contactNo = builder.getContactNo();
		this.address = builder.getAddress();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	public CustomerOrderDO getOrder() {
		return order;
	}

	public void setOrder(CustomerOrderDO order) {
		this.order = order;
	}



	public static class CustomerDOBuilder {
		private String name;
		private String contactNo;
		private String city;
		private AddressDO address;
		
		public CustomerDOBuilder() {
			
		}

		public String getName() {
			return name;
		}
		
		public String getCity() {
			return city;
		}

		public CustomerDOBuilder withCity(String city) {
			this.city = city;
			return this;
		}

		public CustomerDOBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public String getContactNo() {
			return contactNo;
		}

		public CustomerDOBuilder withContactNo(String contactNo) {
			this.contactNo = contactNo;
			return this;
		}

	
		public AddressDO getAddress() {
			return address;
		}

		public CustomerDOBuilder withAddress(AddressDO address) {
			this.address = address;
			return this;
		}
		public CustomerDO build() {
			return new CustomerDO(this);
		}
	}
}
