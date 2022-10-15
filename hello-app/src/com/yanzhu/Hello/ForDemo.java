package com.yanzhu.Hello;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 20, 30, 40, 16, 49, 86, 73};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
