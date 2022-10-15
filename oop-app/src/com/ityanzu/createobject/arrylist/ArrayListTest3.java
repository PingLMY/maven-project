package com.ityanzu.createobject.arrylist;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);

        //2.进行遍历，小于80的值删掉
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < 80){
                scores.remove(i);
                i --;
            }
        }
        System.out.println(scores);
    }
}
