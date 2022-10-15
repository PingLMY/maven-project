package com.ityanzu.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * 生成验证码
 **/

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要的验证码位数：");
        int n = sc.nextInt();
        String code = creatCode(n);
        System.out.println(code);
    }

    public static String creatCode(int n) {
        Random r = new Random();
        String code = "";
        //验证码有大写，小写，数字组成
        for (int i = 0; i < n; i++) {
            //大写，小写，数字  0,1,2
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    char ch1 = (char) (r.nextInt(25) + 65);
                    code += ch1;
                    break;
                case 1:
                    char ch2 = (char) (r.nextInt(25) + 97);
                    code += ch2;
                    break;
                case 2:
                    code += r.nextInt(10);
            }
        }
        return code;
    }
}
