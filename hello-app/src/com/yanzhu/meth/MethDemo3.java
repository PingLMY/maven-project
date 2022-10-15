package com.yanzhu.meth;

public class MethDemo3 {
    public static void main(String[] args) {

        fire();
        fire("岛国");
        fire("岛国",3);
    }

    public static void fire() {
        fire("米国");
    }

    public static void fire(String s) {
        fire(s,1);
    }

    public static void fire(String s, int num) {
        System.out.println(s+num);
    }
}
