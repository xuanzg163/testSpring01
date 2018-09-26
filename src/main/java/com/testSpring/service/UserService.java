package com.testSpring.service;

import com.testSpring.dao.AccountDao;
import com.testSpring.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private AccountDao accountDao;

    public void test(){
        userDao.test();
        accountDao.test();
        System.out.println("UserService---is calling");
    }
}
