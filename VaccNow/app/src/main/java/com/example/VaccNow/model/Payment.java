package com.example.VaccNow.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    private String id;

    private Double amount;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
