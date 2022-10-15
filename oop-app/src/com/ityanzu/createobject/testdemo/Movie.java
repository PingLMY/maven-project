package com.ityanzu.createobject.testdemo;

public class Movie {
    private String name;
    private double score;
    private String acoter;


    public Movie() {
    }

    public Movie(String name, double score, String acoter) {
        this.name = name;
        this.score = score;
        this.acoter = acoter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAcoter() {
        return acoter;
    }

    public void setAcoter(String acoter) {
        this.acoter = acoter;
    }
}
