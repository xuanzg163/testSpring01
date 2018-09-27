package com.testSpring.proxy;

/**
 * 代理角色
 */
public class MarryCompany implements Marry {

    //持有目标对象的引用
    private Marry marry;

    //带参构造将目标对象引用
    public MarryCompany(Marry marry) {
        this.marry = marry;
    }

    //增强目标角色行为
    public void before() {
        System.out.println("开始变强");
    }

    public void after() {
        System.out.println("结束变强");
    }

    //1 与目标角色拥有共同行为
    @Override
    public void toMarry() {

        before();
        marry.toMarry();
        after();

    }
}
