package com.yanzhu.arr;

public class ArrDemo {
    public static void main(String[] args) {
        int[] arr = {12,13,35,67,35};
        print(arr);
    }

    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1 ? arr[i] : arr[i]+",");
        }
        System.out.print("]");
    }
}
