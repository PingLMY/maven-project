package com.ityanzu.demo;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //1.创建中奖号码
        int[] luckNumbers = creatLuckNumber();

        //2.用户输入号码
        int[] userNumbers = userNumber();
        printArr(userNumbers);
        printArr(luckNumbers);
        //3.判断中奖情况
        judge(compare(luckNumbers,userNumbers));

    }

    public static void judge(int[] num) {
        if (num[1] == 1 && num[0] == 1 || num[1] == 1 && num[0] == 0) {
            System.out.println("恭喜你，中六等奖，得5元~~");
        } else if (num[1] == 1 && num[0] == 2 || num[1] == 1 && num[0] == 3 || num[1] == 0 && num[0] == 4){
            System.out.println("恭喜你，中五等奖，得10元~~");
        }else if (num[1]==1 && num[0] == 4 || num[1]==0 && num[0] == 5){
            System.out.println("恭喜你，中四等奖，得200元~~");
        }else if (num[1]==1 && num[0] == 5){
            System.out.println("恭喜你，中三等奖，得3000元~~");
        }else if (num[1]==0 && num[0] == 6){
            System.out.println("恭喜你，中二等奖，得500万元~~");
        }else if (num[1]==6 && num[0] == 1){
            System.out.println("恭喜你，中一等奖，得1000万元~~");
        }
    }

    public static int[] compare(int[] luckNumbers, int[] userNumbers) {
        int[] num = new int[2];
        //判断前六个数相同的个数
        for (int i = 0; i < userNumbers.length - 1; i++) {
            if (luckNumbers[i] == userNumbers[i]) {
                num[0] += 1;
            }
        }
        //判断第七位是否相同
        if (luckNumbers[luckNumbers.length - 1] == userNumbers[userNumbers.length - 1]) {
            num[1] += 1;
        }
        return num;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int[] userNumber() {
        //创建数组
        int[] userNumbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //a.用户先输入前六位号码
        for (int i = 0; i < userNumbers.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字（1-33不重复）：");
            userNumbers[i] = sc.nextInt();
        }
        //b.用户输入蓝球号码
        System.out.println("输入蓝球号码（1-16）：");
        userNumbers[userNumbers.length - 1] = sc.nextInt();
        return userNumbers;
    }

    public static int[] creatLuckNumber() {
        //1.前六个号码不重复（1-33），蓝球号码（1-16）
        int[] luckNumbers = new int[7];
        Random r = new Random();
        //a.先处理前六个号码,遍历随机生成前六个不重复的数字
        for (int i = 0; i < luckNumbers.length - 1; i++) {

            //生成随机数
            int data = r.nextInt(33) + 1;//(0-32)+1
            //判断随机数是否重复
            while (true) {
                //创建flag标识判断是否输出
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (data == luckNumbers[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    luckNumbers[i] = data;
                    break;
                }
            }
        }
        //b.处理最后一位随机数
        luckNumbers[luckNumbers.length - 1] = r.nextInt(16) + 1;//(0-15)+1
        return luckNumbers;
    }
}
