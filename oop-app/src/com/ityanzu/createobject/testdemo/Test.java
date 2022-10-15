package com.ityanzu.createobject.testdemo;

public class Test {
    public static void main(String[] args) {
        //1.创建电影类


        //2.创建电影类数组
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖",9.2,"吴京");
        movies[1] = new Movie("咏春1",9.8,"甄子丹");
        movies[2] = new Movie("邪不压正",9.1,"彭于晏");

        //3.遍历电影类数组
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            //打印输出
            System.out.println("电影名:"+m.getName());
            System.out.println("评分"+m.getScore());
            System.out.println("主演"+m.getAcoter());
            System.out.println("---------------------");
        }
    }
}
