package com.ityanzu.demo;

public class Test2 {
    public static void main(String[] args) {
        //1.i = 101,102,103,...,200

        //2.判断是否为素数
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(i+"\t");
            }
        }

        //3.输出素数
    }
}
