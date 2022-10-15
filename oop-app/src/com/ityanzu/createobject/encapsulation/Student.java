package com.ityanzu.createobject.encapsulation;

public class Student {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && age <= 200) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
