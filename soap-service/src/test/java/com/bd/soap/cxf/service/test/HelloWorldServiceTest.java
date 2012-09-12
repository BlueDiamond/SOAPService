package com.bd.soap.cxf.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bd.soap.cxf.ws.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/service-definition-beans-test.xml" })
public class HelloWorldServiceTest {

	@Autowired
	@Qualifier("helloWorldClient")
	private HelloWorldService helloWorldClient;

	@Test
	public void helloWorldClientTest() {

		helloWorldClient.sayHello();
	}

}
