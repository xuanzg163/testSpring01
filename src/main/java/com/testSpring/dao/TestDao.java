package com.testSpring.dao;

import javax.annotation.Resource;

@Resource
public class TestDao {
    public void test(){
        System.out.println("testDao--被调用了");
    }
}
