package com.yanzhu.scanner;

import java.util.Scanner;


public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年龄:");
        String age = sc.next();
        System.out.println(age);
    }
}
