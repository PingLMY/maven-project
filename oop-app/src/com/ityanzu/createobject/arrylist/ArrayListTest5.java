package com.ityanzu.createobject.arrylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest5 {
    public static void main(String[] args) {
        //1.创建学生类
        //2.创建学生对象集合
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302","叶孤城",23,"护理一班"));
        students.add(new Student("20180303","东方不败",23,"推拿二班"));
        students.add(new Student("20180304","西门吹雪",26,"中药学四班"));
        students.add(new Student("20180305","梅超风",26,"神经科2班"));

        //3.遍历输出
        System.out.println("学号\t姓名\t年龄\t班级");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getStudyNumber()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getClassName());
        }

        //4.输入需要查询的学号
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入需要查询的学生学号：");
            String studyNumber = sc.next();
            Student student = getStudentByNumber(students,studyNumber);
            if (student == null){
                System.out.println("查无此人~~");
            }else{
                System.out.println(student.getStudyNumber()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getClassName());
            }
        }
    }


    /**
     * 按学号查找学生信息
     * @param students  学生对象集合
     * @param studyNumber   需要查询的学号
     * @return  Student | null
     */
    public static Student getStudentByNumber(ArrayList<Student> students, String studyNumber){
        //1.根据学号查找学生信息
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudyNumber().equals(studyNumber)){
                return student;
            }
        }
        return null;
    }
}
