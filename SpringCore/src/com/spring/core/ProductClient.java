package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ProductClient {

	public static void main(String[] args) {
		
		//Product product = new Product();
		Resource resource = new ClassPathResource("springconfig.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Product product = (Product) factory.getBean("product"); // obj
		
		System.out.println(product);
		
		

	}

}
