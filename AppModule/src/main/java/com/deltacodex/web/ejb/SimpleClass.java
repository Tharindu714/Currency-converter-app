package com.deltacodex.web.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class SimpleClass {
    public void simpleMethod() {
        System.out.println("Simple Method");
    }
}
