package com.imooc.testng.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginImooc(){
        System.out.println("慕课网登录成功");
    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("这个是在类之前执行的方法");
    }

    @AfterClass
    public void AfterClass(){

        System.out.println("这个是在类之后执行的方法");
    }
}
