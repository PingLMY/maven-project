package com.ityanzu.demo;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {32,44,87,23,100,2};
        System.out.println(avg(min(arr),max(arr),arr));
    }

    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static double avg(int min, int max, int[] arr){
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (sum - min - max)*1.0/ (arr.length-2);
        return avg;
    }
}
