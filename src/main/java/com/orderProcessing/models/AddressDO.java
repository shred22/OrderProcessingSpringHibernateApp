package com.orderProcessing.models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddressDO {

	private String type;
	private String city;
	private String state;
	private String pincode;
	private CustomerDO customerDO;
	
	public AddressDO() {	}
	
	public AddressDO(AddressDOBuilder builder) {
		this.type = builder.getType();
		this.city = builder.getCity();
		this.state = builder.state;
		this.pincode = builder.getPincode();
	}
	
	
	
	public CustomerDO getCustomerDO() {
		return customerDO;
	}

	public void setCustomerDO(CustomerDO customerDO) {
		this.customerDO = customerDO;
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
	
	public static class AddressDOBuilder {
		private String type;
		private String city;
		private String state;
		private String pincode;
		
		public String getType() {
			return type;
		}
		public AddressDOBuilder withType(String type) {
			this.type = type;
			return this;
		}
		public String getCity() {
			return city;
		}
		public AddressDOBuilder withCity(String city) {
			this.city = city;
			return this;
		}
		public String getState() {
			return state;
		}
		public AddressDOBuilder withState(String state) {
			this.state = state;
			return this;
		}
		public String getPincode() {
			return pincode;
		}
		public AddressDOBuilder withPincode(String pincode) {
			this.pincode = pincode;
			return this;
		}
		
		public AddressDO build() {
			return new AddressDO(this);
		}
		
	}
}
