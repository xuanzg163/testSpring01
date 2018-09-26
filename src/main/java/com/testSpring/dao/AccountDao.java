package com.testSpring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

    public void test(){
        System.out.println("AccountDao---is calling" );
    }
}
