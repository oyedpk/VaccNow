package com.example.VaccNow.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Vaccine {

    @Id
    private String id;

    private String name;

    private Double price;

    @ManyToMany(mappedBy = "vaccines")
    Set<Branch> branches = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
