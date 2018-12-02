package com.learn.publish;

import javax.xml.ws.Endpoint;

import com.learn.ws.HelloWorldImpl;

public class HelloWorldPublisher{
	
	public static void main(String[] args) {
		String endpointUrl = "http://localhost:8089/ws/hellorohit"; 
		Endpoint ep = Endpoint.create(new HelloWorldImpl());
		ep.publish(endpointUrl);
	  // Endpoint.publish("http://localhost:8080/ws/hello", );
	   System.out.println("the web api published at endpoint:"+endpointUrl);
	   try{
		   Thread.sleep(15000);
	   }
	   catch(Exception e){
		   
	   }
	   ep.stop();
	   System.out.println("published service is stoped");
	   /* How to stop endpoint published
	     ans: You have to keep a reference on the Endpoint object and call stop() method on it:*/
    }

}