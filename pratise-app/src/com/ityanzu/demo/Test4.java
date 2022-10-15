package com.ityanzu.demo;

public class Test4 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44};
        int[] arr2 = new int[arr1.length];
        copy(arr1,arr2);
        System.out.println(compare(arr1,arr2));
    }

    public static boolean compare(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void copy(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
