package com.ityanzu.demo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 1.定义一个数组存入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据的位数n：");
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
            }
        add(data);
        yu(data);
        zhuan(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }

    }

    public static void yu(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
    }

    public static void add(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
    }
    
    public static void zhuan(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
