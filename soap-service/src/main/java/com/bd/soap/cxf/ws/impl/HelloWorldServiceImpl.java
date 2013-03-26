package com.bd.soap.cxf.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bd.soap.cxf.ws.HelloWorldService;

@WebService(endpointInterface = "com.bd.soap.cxf.ws.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
	private static Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);
	
	@Override
	public void sayHello() {
		System.out.println("Hello World!!!");
		logger.info("Hello World!!!");
	}

}