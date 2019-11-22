package com.imooc.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsAnnotation {
    @Test(groups = "client")
    public void clientA(){
        System.out.println("这是是客户端group方法1");
    }

    @Test(groups = "server")
    public void ServerA(){
        System.out.println("这是在servergroup的方法1");
    }

    @Test(groups = "client")
    public void clientB(){
        System.out.println("这是客户端group的方法2");
    }



    @Test(groups = "server")
    public void ServreB(){
        System.out.println("这是在servergroup的方法2");
    }

    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("这是在serverGroups方法运行后执行的方法");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("这是在serverGroup方法运行前执行的方法");
    }
}
