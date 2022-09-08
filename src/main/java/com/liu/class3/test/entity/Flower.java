package com.liu.class3.test.entity;








import javax.persistence.*;


@Entity

public class Flower extends Plant {

    private String color;


    //constructors
    public Flower(){

    }

    public Flower(String color){

        this.color = color;

    }

    // setters & getters



    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }


}
