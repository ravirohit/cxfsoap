Ref link to help: https://www.mkyong.com/webservices/jax-ws/jax-ws-wsgen-tool-example/
This is simplest way to create soap api and published it to any url without the help of running any server jboss or tomcat.
Steps to create this API:
1. Download the jar file and add it the project library path: jaxws-api-2.1-1.jar
2. create the wsimpl class like here: HelloWorldImpl.java 
   note: it is not mandatory to create interface and implement it in HelloWorldImpl.java 
3. create a published class which will deploy the ws to the endpoint like here done in HelloWorldPublisher.java file.
4. Now when we run the HelloWorldPublisher.java file as java application. it will throw below error:
Error:
   when you run the end point publisher, you will hits following error message :
		Wrapper class com.mkyong.ws.jaxws.GetHelloWorldAsString is not found. 
    	Have you run APT to generate them?
Solution: You need to use “wsgen” tool to generate necessary JAX-WS portable artifacts. Let move to next step.
5.  Generates JAX-WS portable artifacts (Java files) for web service deployment.
	Ex:
  5.1: C:\Users\raviro\Desktop\Doc\Code_Practice_SOAP\soapapi\target\soapapi\WEB-INF\classes>"c:\Program Files\Java\jdk1.8.0_161\bin\wsgen" -keep -cp . com.learn.soapresource.HelloServiceImpl
    if the wsimpl class is in x.x package then put the generated java file in the package x.x.jaxws like we have did here in the project. 
    wsimpl class is in package com.learn.ws so i have put the generated java file in com.learn.ws.jaxws package.
  5.2. Generates WSDL and xsd files, for testing or web service client development as below.
	for current use:
	C:\Users\raviro\Desktop\Doc\Code_Practice_SOAP\soapapi\target\soapapi\WEB-INF\classes>"c:\Program Files\Java\jdk1.8.0_161\bin\wsgen" -keep -cp . com.learn.soapresource.HelloServiceImpl -wsdl
6. now we can again published the ws on the any endpoint.
7. once ws is published on any endpoint, we can consume the service from any where. here we have created the ws client which we will run to 
   test whether really ws has pubslished sucessfully by hitting to the endpoint. 	

    