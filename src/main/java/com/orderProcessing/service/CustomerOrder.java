package com.orderProcessing.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="customerorder")
public class CustomerOrder {

	@Id
	@TableGenerator(name="tg" , table="pk_table", pkColumnName="name" , 
	valueColumnName="value" , allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE , generator="tg")
	private int id;
	@Temporal(TemporalType.DATE)
	Date orderDate;
	@ManyToMany(cascade = { CascadeType.ALL })
    //@JoinTable(name = "CustomerOrder_customer"/*, joinColumns = { @JoinColumn(name = "id") }, 
   // inverseJoinColumns = { @JoinColumn(name = "productId")}*/)
	private Set<Product> product = new HashSet<>();
	@ManyToOne(cascade = { CascadeType.ALL })
    //@JoinTable(name = "CustomerOrder_customer"/*, joinColumns = { @JoinColumn(name = "id") }, 
   // inverseJoinColumns = { @JoinColumn(name = "custId")}*/)
	private Customer customer;
	
	public Set<Product> getProduct() {
		return product;
	}
	public CustomerOrder() {
		super();
	}
	public CustomerOrder(CustomerOrderBuilder builder) {
		
		
		this.customer = builder.getCustomer();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public static class CustomerOrderBuilder {
	
		private Date orderDate;
		private Product product;
		private Customer customer;
		
		public Date getOrderDate() {
			return orderDate;
		}
		public CustomerOrderBuilder withOrderDate(Date orderDate) {
			this.orderDate = orderDate;
			return this;
		}
		public Product getProduct() {
			return product;
		}
		public CustomerOrderBuilder withProduct(Product product) {
			this.product = product;
			return this;
		}
		public Customer getCustomer() {
			return customer;
		}
		public CustomerOrderBuilder withCustomer(Customer customer) {
			this.customer = customer;
			return this;
		}
		public CustomerOrder build() {
			return new CustomerOrder(this);
		}
	}
}
