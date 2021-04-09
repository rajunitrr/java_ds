package com.designpatterns;

public class Client {

	public static void main(String[] args) throws Exception {

		ProxyInternet p=new ProxyInternet();
		p.connectTo("abc.com");
		
		
	}

}
