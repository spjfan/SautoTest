package com.imooc.testng.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){

        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){

        System.out.println("afterSuite");
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
