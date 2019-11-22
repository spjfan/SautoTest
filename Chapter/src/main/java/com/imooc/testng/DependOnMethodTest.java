package com.imooc.testng;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;

public class DependOnMethodTest {

    @Test
    public void funcA(){
        System.out.println("A run");
    }

    @Test(dependsOnMethods = {"funcA","funcE"})
    public void funcB(){
        System.out.println("B run,B depend on A");
    }

    @Test
    public void funcC(){
        System.out.println("C Exception");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "funcC")
    public void funcD(){
        System.out.println("D run,D depend on C");
    }

    @Test
    public void funcE(){
        System.out.println(" E run");
    }
}
