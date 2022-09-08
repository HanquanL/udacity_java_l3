package com.liu.class3.test.entity;



import java.math.BigDecimal;


public class PlantDTO {
    private String name;
    private BigDecimal price;

    //constructor
    public PlantDTO(){

    }
    PlantDTO(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }

    //setters and getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public BigDecimal getPrice(){
        return price;
    }

}
