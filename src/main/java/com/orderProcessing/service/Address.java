package com.orderProcessing.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class Address {
	
	@Id
	@TableGenerator(name="tg" , table="pk_table", pkColumnName="name" , 
	valueColumnName="value" , allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE , generator="tg")
	private int addressId;
	private String type;
	private String city;
	private String state;
	private String pincode;
	@OneToMany(cascade= CascadeType.ALL)
	private Set<Customer> customer = new HashSet<>();
	
	public Address() {	}
	
	public Address(AddressBuilder builder) {
		this.type = builder.getType();
		this.city = builder.getCity();
		this.state = builder.getState();
		this.pincode =builder.getPincode();
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	public Set<Customer> getCustomer() {
		return customer;
	}



	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}



	public static class AddressBuilder {
		private String type;
		private String city;
		private String state;
		private String pincode;
		private Customer customer;
		
		public String getType() {
			return type;
		}
		public AddressBuilder withType(String type) {
			this.type = type;
			return this;
		}
		public String getCity() {
			return city;
		}
		public AddressBuilder withCity(String city) {
			this.city = city;
			return this;
		}
		public String getState() {
			return state;
		}
		public AddressBuilder withState(String state) {
			this.state = state;
			return this;
		}
		public String getPincode() {
			return pincode;
		}
		public AddressBuilder withPincode(String pincode) {
			this.pincode = pincode;
			return this;
		}
		public Customer getCustomer() {
			return customer;
		}

		public AddressBuilder withCustomer(Customer customer) {
			this.customer = customer;
			return this;
		}
		
		public Address build() {
			return new Address(this);
		}
	}
}
