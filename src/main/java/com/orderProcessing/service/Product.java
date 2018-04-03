package com.orderProcessing.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="products")
@NamedQuery(name ="getAllProduct", query="SELECT P FROM Product P")
public class Product {

	@Id
	@TableGenerator(name="tg" , table="pk_table", pkColumnName="name" , 
	valueColumnName="value" , allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE , generator="tg")
	private int productId;
	private String productName;
	private String productDescription;
	private String productCategory;
	@ManyToMany(mappedBy="product", cascade= CascadeType.ALL)
	private Set<CustomerOrder> order = new HashSet<>();
	public Product() {
		
	}
	
	public Product(ProductBuilder builder) {

		this.productId = builder.getProductId();
		this.productName = builder.getProductName();
		this.productDescription = builder.getProductDescription();
		this.productCategory = builder.getProductCategory();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
		
	
	public Set<CustomerOrder> getOrder() {
		return order;
	}


	public static class ProductBuilder {
		private int productId;
		private String productName;
		private String productDescription;
		private String productCategory;
		private CustomerOrder order;
		
		public int getProductId() {
			return productId;
		}
		public ProductBuilder withProductId(int productId) {
			this.productId = productId;
			return this;
		}
		public String getProductName() {
			return productName;
		}
		public ProductBuilder withProductName(String productName) {
			this.productName = productName;
			return this;
		}
		public String getProductDescription() {
			return productDescription;
		}
		public ProductBuilder withProductDescription(String productDescription) {
			this.productDescription = productDescription;
			return this;
		}
		public String getProductCategory() {
			return productCategory;
		}
		public ProductBuilder withProductCategory(String productCategory) {
			this.productCategory = productCategory;
			return this;
		}
		public CustomerOrder getOrder() {
			return order;
		}
		public ProductBuilder withOrder(CustomerOrder order) {
			this.order = order;
			return this;
		}
		
		public Product build() {
			return new Product(this);
		}
		
		
	}
	
}
