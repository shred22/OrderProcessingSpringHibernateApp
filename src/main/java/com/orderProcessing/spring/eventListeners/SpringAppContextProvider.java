package com.orderProcessing.spring.eventListeners;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class SpringAppContextProvider implements ApplicationContextAware {
	 	
	private static ApplicationContext applicationContext;     

	    public void setApplicationContext(ApplicationContext context) throws BeansException {
	      applicationContext = context;
	    }

	    public static ApplicationContext getApplicationContext() {
	      return applicationContext;
	    }

		
}
