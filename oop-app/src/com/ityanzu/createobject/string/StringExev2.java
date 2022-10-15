package com.ityanzu.createobject.string;

//手机号码遮挡

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringExev2 {
    public static void main(String[] args) {
        //1.输入一个手机号码
        Scanner sc = new Scanner(System.in);
        System.out.println("输入手机号：");
        String tel = sc.next();

        //2.获取前三位与后四位数字 123456789AB
        String before = tel.substring(0,3);
        String after = tel.substring(7);
        String s = before + "****" + after;
        System.out.println(s);
    }
}
