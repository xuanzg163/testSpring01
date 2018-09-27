package com.testSpring.proxy;

/**
 *  实现行为接口
 */
public class You implements Marry {

    @Override
    public void toMarry() {
        System.out.println("用户行为被实现了");
    }
}
