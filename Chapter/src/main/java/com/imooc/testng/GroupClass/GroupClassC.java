package com.imooc.testng.GroupClass;

import org.testng.annotations.Test;

@Test(groups = "classAC")
public class GroupClassC {
    public void groupClassC(){
        System.out.println("这是C类测试运行");
    }
}
