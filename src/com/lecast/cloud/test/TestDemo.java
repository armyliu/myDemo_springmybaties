package com.lecast.cloud.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lecast.cloud.controller.FirstController;

public class TestDemo {

	@Test
	public void testdd(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		FirstController bean = (FirstController) applicationContext.getBean("test");
		System.out.println(bean);
	}
}
