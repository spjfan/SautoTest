package com.imooc.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test(enabled = true)
    public void first(){
        System.out.println("enabled为true的测试方法");
    }

    @Test(enabled = false)
    public void two(){
        System.out.println("enabled为false的测试方法");
    }

}
