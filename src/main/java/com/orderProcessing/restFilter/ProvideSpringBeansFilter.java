package com.orderProcessing.restFilter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@Provider
public class ProvideSpringBeansFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		System.out.println("Rest filter called for providing Spring Beans");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		requestContext.setProperty("springAppContext", context);
	}

}
