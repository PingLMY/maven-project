package com.yanzhu.test;

import java.util.Scanner;

public class Plant {
    public static void main(String[] args) {
        //1.键盘输入月份和乘坐的位置类型
        //2.进行相应的价格折扣
        Scanner sc = new Scanner(System.in);
        System.out.println("输入机票的原价：");
        double money = sc.nextDouble();
        System.out.println("输入当前月份：");
        int mon = sc.nextInt();
        System.out.println("输入位置类型：");
        String type = sc.next();

        //调用方法
        money = cacl(money,mon,type);

        //打印输出
        System.out.println(money);
    }

    public static double cacl(double money, int mon, String type) {
        if (mon >= 5 && mon <= 10) {
            switch (type) {
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的位置类型错误~~");
                    money = -1;
            }
        } else if (mon == 11 || mon == 12 || mon >= 1 && mon <= 4) {
            switch (type) {
                case "头等舱":
                    money *= 0.8;
                case "经济舱":
                    money *= 0.75;
            }
        } else {
            System.out.println("您输入的月份错误~~");
            money = -1;
        }
        return money;
    }
}
