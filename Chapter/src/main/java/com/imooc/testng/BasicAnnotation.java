package com.imooc.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCaseA(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCaseB(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在被测方法运行前执行的方法");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在被测方法后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
