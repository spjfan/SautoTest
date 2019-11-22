package com.imooc.testng.GroupClass;

import org.testng.annotations.Test;

@Test(groups = "classB")
public class GroupClassB {
    public void groupClassB(){
        System.out.println("这是B类测试");
    }
}
