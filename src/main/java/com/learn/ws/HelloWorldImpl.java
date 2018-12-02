package com.learn.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.learn.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		System.out.println("web service method invoked with request payload:\t"+name);
		return "Hit the api successfully";
	}
	

}
