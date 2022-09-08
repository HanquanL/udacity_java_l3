package com.liu.class3.test.entity;

import javax.persistence.Entity;

@Entity
public class Shrub extends Plant {

    private int heightCm;
    private int widthCm;

    //constructors
    public Shrub(){

    }
    public Shrub(int heightCm, int widthCm){
        this.heightCm = heightCm;
        this.widthCm = widthCm;
    }

    //setters and getters
    public void setHeightCm(int heightCm){
        this.heightCm = heightCm;
    }
    public int getHeightCm(){
        return heightCm;
    }

    public void setWidthCm(int widthCm){
        this.widthCm = widthCm;
    }
    public  int getWidthCm(){
        return widthCm;
    }
}
