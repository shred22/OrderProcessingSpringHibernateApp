package com.orderProcessing.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class Customer {
	
	@Id
	@TableGenerator(name="tg" , table="pk_table", pkColumnName="name" , 
	valueColumnName="value" , allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE , generator="tg")
	private int custId;
	private String name;
	private String contactNo;
	private String emailId;	
	@OneToMany(mappedBy="customer")
	private Set<Address> address = new HashSet<>();
	@OneToMany(mappedBy="customer")
	private Set<CustomerOrder> order = new HashSet<>();
	
	public Customer() {
		super();
	}
	public Customer(CustomerBuilder builder) {
		this.name = builder.getName();
		this.contactNo = builder.getContactNo();	
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public Set<CustomerOrder> getOrder() {
		return order;
	}
	
	public static class CustomerBuilder {
		private String name;
		private String contactNo;
		//@OneToOne(mappedBy="customer")
		private Address address;
		//@OneToOne(mappedBy="customer")
		/*private CustomerOrderBO order;*/
		public CustomerBuilder() {
			// TODO Auto-generated constructor stub
		}
		public String getName() {
			return name;
		}
		public CustomerBuilder withName(String name) {
			this.name = name;
			return this;
		}
		public String getContactNo() {
			return contactNo;
		}
		public CustomerBuilder withContactNo(String contactNo) {
			this.contactNo = contactNo;
			return this;
		}
		public Address getAddress() {
			return address;
		}
		public CustomerBuilder withAddress(Address address) {
			this.address = address;
			return this;
		}
		
		public Customer build() {
			return new Customer(this);
		}
	}
}
