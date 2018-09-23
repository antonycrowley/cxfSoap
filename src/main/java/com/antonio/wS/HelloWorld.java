package com.antonio.wS;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    int sum(int a, int b);
}

