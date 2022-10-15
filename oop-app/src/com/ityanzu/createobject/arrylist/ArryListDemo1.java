package com.ityanzu.createobject.arrylist;

import java.util.ArrayList;

public class ArryListDemo1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add("张学友");
        list1.add("郭富城");
        list1.add("黎明");
        list1.add("刘德华");

        list1.add(3,"梁朝伟");

        System.out.println(list1);
    }

}
