
package com.antonio.wS;

import javax.jws.WebService;

@WebService(endpointInterface = "com.antonio.wS.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public int sum(int a, int b) {
    	return a + b;
    }
}

