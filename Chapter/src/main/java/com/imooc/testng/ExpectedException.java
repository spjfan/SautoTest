package com.imooc.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void IndexOutOfBoundsExceptionTestA(){
        System.out.println("这是期望抛出IndexOutOfBoundsException的测试");
        throw new IndexOutOfBoundsException();
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void IndexOutOfBoundsExceptionTestB(){
        System.out.println("这是期望抛出IndexOutOfBoundsException的测试,没有异常");

    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void IndexOutOfBoundsExceptionTestC(){
        System.out.println("这是期望抛出IndexOutOfBoundsException的测试,异常不对");
        System.out.println(RuntimeException.class);
        throw new RuntimeException();
    }
}
