package com.orderProcessing.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductsDO {
	private int productId;
	private String productName;
	private String productDescription;
	private String productCategory;
	private CustomerOrderDO order;
	
	
	public ProductsDO() {
		super();
	}
	public ProductsDO(ProductsDOBuilder builder) {

		this.productId = builder.getProductId();
		this.productName = builder.getProductName();
		this.productDescription = builder.getProductDescription();
		this.productCategory = builder.getProductCategory();
		this.order = builder.getOrder();
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
	public CustomerOrderDO getOrder() {
		return order;
	}
	public void setOrder(CustomerOrderDO order) {
		this.order = order;
	}	
	
	public static class ProductsDOBuilder {
		private int productId;
		private String productName;
		private String productDescription;
		private String productCategory;
		private CustomerOrderDO order;
		
		public int getProductId() {
			return productId;
		}
		public ProductsDOBuilder withProductId(int productId) {
			this.productId = productId;
			return this;
		}
		public String getProductName() {
			return productName;
		}
		public ProductsDOBuilder withProductName(String productName) {
			this.productName = productName;
			return this;
		}
		public String getProductDescription() {
			return productDescription;
		}
		public ProductsDOBuilder withProductDescription(String productDescription) {
			this.productDescription = productDescription;
			return this;
		}
		public String getProductCategory() {
			return productCategory;
		}
		public ProductsDOBuilder withProductCategory(String productCategory) {
			this.productCategory = productCategory;
			return this;
		}
		public CustomerOrderDO getOrder() {
			return order;
		}
		public ProductsDOBuilder withOrder(CustomerOrderDO order) {
			this.order = order;
			return this;
		}
		
		public ProductsDO build() {
			return new ProductsDO(this);
		}
		
		
	}
}
