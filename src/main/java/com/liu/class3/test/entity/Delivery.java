package com.liu.class3.test.entity;

import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NamedQuery(
        name = "Delivery.findByName",
        query = "select d from Delivery d where d.name = :name"
)
@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;
    @Column(name = "address_full", length = 500)
    private String address;
    private LocalDateTime deliveryTime;
    @Type(type = "yes_no")
    private Boolean completed;

    // added CascadeType.REMOVE to automatically clear any associated plants when removed
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<Plant> plants;

    //constructors

    public Delivery(){

    }
    public Delivery(String name, String address, LocalDateTime deliveryTime, Boolean completed){
        this.name = name;
        this.address = address;
        this.deliveryTime = deliveryTime;
        this.completed = completed;
    }

    // setters and getters
    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime){
        this.deliveryTime = deliveryTime;
    }
    public LocalDateTime getDeliveryTime(){
        return deliveryTime;
    }

    public void setCompleted(Boolean completed){
        this.completed = completed;
    }
    public Boolean getCompleted(){
        return completed;
    }

    public void setPlants(List<Plant> plants){
        this.plants = plants;
    }
    public List<Plant> getPlants(){
        return plants;
    }
}
