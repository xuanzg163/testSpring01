package com.testSpring.service;

import com.testSpring.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


public class TestService {

    @Autowired
    private TestDao testDao;

    @Resource
    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public void test(){
        testDao.test();
        System.out.println("TestService---被调用了"
        );
    }
}
