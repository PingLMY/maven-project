package com.yanzhu.meth;

public class MethDemo1 {
    public static void main(String[] args) {
        int[] arr = {14,15,26,47,84};
        int i = searchIndex(arr,47);
        System.out.println(i);
    }

    public static int searchIndex(int[] arr, int data){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data){
                return i;
            }
        }
        return -1;
    }
}
