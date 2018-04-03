//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.16 at 07:19:53 PM IST 
//


package customerOrderXSDClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="address">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="orderdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expedite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customer",
    "orderdate",
    "expedite"
})
@XmlRootElement(name = "customerOrder")
public class CustomerOrder {

    @XmlElement(required = true)
    protected CustomerOrder.Customer customer;
    @XmlElement(required = true)
    protected String orderdate;
    @XmlElement(required = true)
    protected String expedite;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderBO.Customer }
     *     
     */
    public CustomerOrder.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderBO.Customer }
     *     
     */
    public void setCustomer(CustomerOrder.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the orderdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderdate() {
        return orderdate;
    }

    /**
     * Sets the value of the orderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderdate(String value) {
        this.orderdate = value;
    }

    /**
     * Gets the value of the expedite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpedite() {
        return expedite;
    }

    /**
     * Sets the value of the expedite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpedite(String value) {
        this.expedite = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="address">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "productId",
        "contactNo",
        "emailId",
        "address"
    })
    public static class Customer {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String productId;
        @XmlElement(required = true)
        protected String contactNo;
        @XmlElement(required = true)
        protected String emailId;
        @XmlElement(required = true)
        protected CustomerOrder.Customer.Address address;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductId(String value) {
            this.productId = value;
        }

        /**
         * Gets the value of the contactNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactNo() {
            return contactNo;
        }

        /**
         * Sets the value of the contactNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactNo(String value) {
            this.contactNo = value;
        }

        /**
         * Gets the value of the emailId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailId() {
            return emailId;
        }

        /**
         * Sets the value of the emailId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailId(String value) {
            this.emailId = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerOrderBO.Customer.Address }
         *     
         */
        public CustomerOrder.Customer.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerOrderBO.Customer.Address }
         *     
         */
        public void setAddress(CustomerOrder.Customer.Address value) {
            this.address = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type",
            "street",
            "city",
            "state",
            "pincode"
        })
        public static class Address {

            @XmlElement(required = true)
            protected String type;
            @XmlElement(required = true)
            protected String street;
            @XmlElement(required = true)
            protected String city;
            @XmlElement(required = true)
            protected String state;
            @XmlElement(required = true)
            protected String pincode;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the street property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreet() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreet(String value) {
                this.street = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the pincode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPincode() {
                return pincode;
            }

            /**
             * Sets the value of the pincode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPincode(String value) {
                this.pincode = value;
            }

        }

    }

}
