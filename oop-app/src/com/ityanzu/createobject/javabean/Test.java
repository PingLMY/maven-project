package com.ityanzu.createobject.javabean;

public class Test {
    public static void main(String[] args) {
        //无参构造器
        User u = new User();
        u.setName("吴彦祖");
        u.setHeight(180.0);
        u.setSalary(1000.0);
        System.out.println("名字："+u.getName());
        System.out.println("身高："+u.getHeight());
        System.out.println("薪水："+u.getSalary());

        //有参构造器
        User u1 = new User("梁朝伟",185.3,2000.0);
        System.out.println("名字："+u1.getName());
        System.out.println("身高："+u1.getHeight());
        System.out.println("薪水："+u1.getSalary());
    }
}
