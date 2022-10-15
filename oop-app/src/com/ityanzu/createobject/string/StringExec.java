package com.ityanzu.createobject.string;

import java.util.Random;

public class StringExec {
    public static void main(String[] args) {
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code = "";
        Random r = new Random();
        //生成五位数的验证码
        for (int i = 0; i < 5; i++) {
            //随机定位到data中的位置
            int index = r.nextInt(data.length());
            //找到定位到的位置的信息
            char c = data.charAt(index);
            code += c;
        }
        System.out.println(code);
    }
}
