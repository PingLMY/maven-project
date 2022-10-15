package com.ityanzu.createobject.arrylist;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        //1.创建电影类


        //2.创建电影类集合
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.6,"张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》",9.5,"汤姆·汉克斯"));

        //3.遍历输出
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("电影名称："+movie.getName());
            System.out.println("电影评分："+movie.getScores());
            System.out.println("电影主演："+movie.getActor());
            System.out.println("------------------------------------");
        }
    }
}
