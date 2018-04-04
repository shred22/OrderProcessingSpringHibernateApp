package com.orderProcessing.models;

import java.util.Date;

import com.orderProcessing.service.Customer;
import com.orderProcessing.service.Product;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("unused")
public class CustomerOrderDO {

	private Date orderDate;
	private ProductsDO product;
	private CustomerDO customer;

	
	
	public CustomerOrderDO() {
		super();
	}


	public CustomerOrderDO(CustomerOrderDOBuilder builder) {
		this.orderDate = builder.getOrderDate();
		this.product = builder.getProduct();
		this.customer = builder.getCustomer();
	}

	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public ProductsDO getProduct() {
		return product;
	}

	public void setProduct(ProductsDO product) {
		this.product = product;
	}

	public CustomerDO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDO customer) {
		this.customer = customer;
	}
	
	public static class CustomerOrderDOBuilder {
	
		
		public Date getOrderDate() {
			return orderDate;
		}
		public ProductsDO getProduct() {
			return product;
		}
		public CustomerDO getCustomer() {
			return customer;
		}

		private Date orderDate;
		private ProductsDO product;
		private CustomerDO customer;
		
		
		public CustomerOrderDOBuilder withOrderDate(Date orderDate) {
			this.orderDate = orderDate;
			return this;
		}
		public CustomerOrderDOBuilder withProduct(ProductsDO product) {
			this.product = product;
			return this;
		}
		public CustomerOrderDOBuilder withCustomer(CustomerDO customer) {
			this.customer = customer;
			return this;
		}
		
		public CustomerOrderDO build() {
			return new CustomerOrderDO(this);
		}
		
		
		
	}
}
