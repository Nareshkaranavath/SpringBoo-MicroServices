package com.bean.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static <ConfigurableApplication> void main(String[] args) {
		ClassPathXmlApplicationContext conxt = new ClassPathXmlApplicationContext("scope.xml");

	Engine engine =conxt.getBean(Engine.class);
          engine.doWork();
          
          ConfigurableApplicationContext ca = (ConfigurableApplicationContext)conxt;
             ca.close();
	}
}
