package com.imooc.testng.GroupClass;

import org.testng.annotations.Test;

@Test(groups = "classAC")
public class GroupClassA {
    public void groupClassA(){
        System.out.println("这是A类测试");
    }
}
