package com.yanzhu.returnDemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        chu(4, 3);
    }

    public static void chu(int a, int b) {
        if (b == 0) {
            System.err.println("错误！！");
            return;
        }
        double c = a / b;
        System.out.printf("%.2f",c);
    }
}
