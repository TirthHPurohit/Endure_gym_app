package com.example.endure.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Workout implements Serializable {

    //Variables
    private String title;
    private String description;
    private String picPath;
    private int kcal;
    private String durationAll;
    private ArrayList<Lessons> Lessons;

    //Constructor
    public Workout(String title, String description, String picPath, int kcal, String durationAll, ArrayList<com.example.endure.Domain.Lessons> lessons) {
        this.title = title;
        this.description = description;
        this.picPath = picPath;
        this.kcal = kcal;
        this.durationAll = durationAll;
        Lessons = lessons;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getDurationAll() {
        return durationAll;
    }

    public void setDurationAll(String durationAll) {
        this.durationAll = durationAll;
    }

    public ArrayList<com.example.endure.Domain.Lessons> getLessons() {
        return Lessons;
    }

    public void setLessons(ArrayList<com.example.endure.Domain.Lessons> lessons) {
        Lessons = lessons;
    }
}
