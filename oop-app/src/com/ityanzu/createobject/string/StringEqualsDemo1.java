package com.ityanzu.createobject.string;

import java.util.Scanner;

public class StringEqualsDemo1 {
    public static void main(String[] args) {
        String okName = "yanzu";
        String okPassword = "123456";
        Scanner sc = new Scanner(System.in);

        System.out.println("输入用户名：");
        String name = sc.next();
        System.out.println("输入用户密码：");
        String password = sc.next();

        if (okName.equals(name) && okPassword.equals(password)){
            System.out.println("登陆成功~~");
        }else{
            System.out.println("登陆失败~~");
        }
    }
}
