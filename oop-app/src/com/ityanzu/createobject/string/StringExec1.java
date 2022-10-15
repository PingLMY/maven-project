package com.ityanzu.createobject.string;

//模拟登录

import java.util.Scanner;

public class StringExec1 {
    public static void main(String[] args) {
        //1.创建用户名和密码
        String userName = "admin";
        String passWord = "123456";

        //2.用户输入（3次机会）
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.println("输入用户名：");
            String name = sc.next();
            System.out.println("输入用户名密码：");
            String password = sc.next();
            if (userName.equals(name)){
                if (passWord.equals(password)){
                    System.out.println("登陆成功~~");
                    break;
                } else{
                    System.out.println("用户名密码输入错误~~，剩余"+(3-i)+"次机会");
                }

            }else{
                System.out.println("用户名输入错误~~，剩余"+(3-i)+"次机会");
            }
        }
        }
}
