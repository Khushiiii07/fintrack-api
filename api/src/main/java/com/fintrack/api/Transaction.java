///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.fintrack.api;
//
///**
// *
// * @author Khushi
// */
//import java.util.Date;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//@Entity
//@Table(name = "transactions") // This maps this class to a SQL database table automatically
//public class Transaction {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Creates Auto-incrementing IDs (1, 2, 3...)
//    private Long id;
//
//    private String description;
//    private double amount;
//    private String category; // e.g., Food, Rent, Entertainment
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date date;
//
//    // --- CONSTRUCTORS ---
//    public Transaction() {
//        this.date = new Date(); // Automatically sets current time when a transaction is made
//    }
//
//    public Transaction(String description, double amount, String category) {
//        this.description = description;
//        this.amount = amount;
//        this.category = category;
//        this.date = new Date();
//    }
//
//    // --- GETTERS AND SETTERS ---
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public String getDescription() { return description; }
//    public void setDescription(String description) { this.description = description; }
//
//    public double getAmount() { return amount; }
//    public void setAmount(double amount) { this.amount = amount; }
//
//    public String getCategory() { return category; }
//    public void setCategory(String category) { this.category = category; }
//
//    public Date getDate() { return date; }
//    public void setDate(Date date) { this.date = date; }
//}
package com.fintrack.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String description;
    private double amount;
    private String category;
    private String type; // "INCOME" or "EXPENSE"
    private Date date = new Date();

    // --- CONSTRUCTOR ---
    public Transaction() {
        // Required empty constructor for JPA
    }

    // --- GETTERS AND SETTERS ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}