package com.orderProcessing.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.context.support.AbstractApplicationContext;

import com.orderProcessing.service.bo.ProductBO;
import com.orderProcessing.spring.eventListeners.SpringAppContextProvider;

import customerOrderXSDClasses.Product;

@Path("/product")
public class ProductsResource   {

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/add")
	public Product addProduct(Product product) {
		
		ProductBO productBO = (ProductBO)SpringAppContextProvider.getApplicationContext().getBean("productBO");
		com.orderProcessing.service.Product domain  = new com.orderProcessing.service.Product();
		domain.setProductCategory(product.getProductCategory());
		domain.setProductDescription(product.getProductDescription());
		domain.setProductName(product.getProductName());

		productBO.save(domain);
		((AbstractApplicationContext)SpringAppContextProvider.getApplicationContext()).close();
		return product;
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/getAll")
	public List<Product> getAllProducts(@Context ContainerRequestContext crc) {
		
		ProductBO productBO = (ProductBO)SpringAppContextProvider.getApplicationContext().getBean("productBO");
		List<com.orderProcessing.service.Product> products = productBO.getAllProducts();
		
		List<Product> finalList = new ArrayList<>();
		
		for(com.orderProcessing.service.Product prod : products) {
			Product product = new Product();
			product.setProductCategory(prod.getProductCategory());
			product.setProductDescription(prod.getProductDescription());
			product.setProductName(prod.getProductName());
			product.setProductId(prod.getProductId());
			finalList.add(product);
		}
		return finalList;
	}
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/update")
	public Product updateProduct(Product prod) {
		
		ProductBO productBO = (ProductBO)SpringAppContextProvider.getApplicationContext().getBean("productBO");
		com.orderProcessing.service.Product product = new com.orderProcessing.service.Product();
		product.setProductCategory(prod.getProductCategory());
		product.setProductDescription(prod.getProductDescription());
		product.setProductName(prod.getProductName());
		product.setProductId(prod.getProductId());
		
		productBO.update(product);
		
		return prod;
	}

}
