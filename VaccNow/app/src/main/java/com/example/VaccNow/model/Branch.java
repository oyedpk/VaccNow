package com.example.VaccNow.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Branch {

    @Id
    private String id;

    private String name;

    private String capacity;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "branch_vaccine",
            joinColumns = { @JoinColumn(name = "branch_id") },
            inverseJoinColumns = { @JoinColumn(name = "vaccine_id") }
    )
    Set<Vaccine> vaccines = new HashSet<>();

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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
