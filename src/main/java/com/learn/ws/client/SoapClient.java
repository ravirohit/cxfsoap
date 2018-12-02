package com.learn.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.learn.ws.HelloWorld;

public class SoapClient {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("Client making call to the published api");
		URL url = new URL("http://localhost:8089/ws/hellorohit?wsdl");
        QName qname = new QName("http://ws.learn.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println("response from api:"+hello.getHelloWorldAsString("{\"name\":\"rohit\"}"));

	}

}
