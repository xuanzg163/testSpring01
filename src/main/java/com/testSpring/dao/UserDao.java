package com.testSpring.dao;


import org.springframework.stereotype.Repository;


@Repository
public class UserDao {

    public void test(){
        System.out.println("UserDao---is calling");
    }
}
