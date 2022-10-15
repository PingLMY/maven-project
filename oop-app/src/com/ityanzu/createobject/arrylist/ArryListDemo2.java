package com.ityanzu.createobject.arrylist;

import java.util.ArrayList;

public class ArryListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("MySql");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        String s = list.remove(0);
        System.out.println(s+list);
    }
}
