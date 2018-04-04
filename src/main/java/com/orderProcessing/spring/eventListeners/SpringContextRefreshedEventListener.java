package com.orderProcessing.spring.eventListeners;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Shreyas Dange
 * 
 */
@Component
public class SpringContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {



	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		ApplicationContext context = event.getApplicationContext();
		System.out.println("********ContextRefreshed Event from OrderProcessing App *********");
		System.out.println("Beans Defined : "+Arrays.toString(context.getBeanDefinitionNames()));
		
	}

} 