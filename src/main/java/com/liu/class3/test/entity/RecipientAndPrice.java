package com.liu.class3.test.entity;

import java.math.BigDecimal;

public class RecipientAndPrice {
    private String recipientName;
    private BigDecimal price;

    public RecipientAndPrice(){

    }
    public RecipientAndPrice(String recipientName, BigDecimal price){
        this.recipientName = recipientName;
        this.price = price;
    }

    public void setRecipientName(String name){
        this.recipientName = recipientName;
    }
    public String getRecipientName(){
        return recipientName;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public BigDecimal getPrice(){
        return price;
    }
}
