package com.liu.class3.test.entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.liu.class3.test.view.Views;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Plant {

    @Id
    @GeneratedValue
    private Long id;

    @JsonView(Views.Public.class)
    @Nationalized
    private String name;
    @JsonView(Views.Public.class)
    @Column(precision = 12, scale = 4)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)  //don't retrieve delivery if we don't need it
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    //constructors
    public Plant(){

    }
    public Plant(String name, BigDecimal price, Delivery delivery){
        this.name = name;
        this.price = price;
        this.delivery = delivery;
    }

    //setters and getters
    public Long getId(){
        return id;
    }
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

    public void setDelivery(Delivery delivery){
        this.delivery = delivery;
    }
    public Delivery getDelivery(){
        return delivery;
    }

}
