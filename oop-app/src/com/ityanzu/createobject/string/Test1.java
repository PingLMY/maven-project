package com.ityanzu.createobject.string;

public class Test1 {
    public static void main(String[] args) {
//        String s1 = "你好啊";
//        String s2 = "你好啊";
//        System.out.println((s1 == s2));
//        String s3 = new String("ad");
//        String s4 = new String("ad");
//        System.out.println(s3 == s4);
        char[] ch = {'a','b','c'};
        String s1 = "abc";
        String s2 = new String(ch);
        System.out.println(s1 == s2);

    }
}
