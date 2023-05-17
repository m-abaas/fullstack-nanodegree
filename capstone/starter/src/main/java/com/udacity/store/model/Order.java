package com.udacity.store.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    public Order() {
    }

    public Order(String name, Double price) {
        this.name = name;
        this.price = price;
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

    //    @Id
//    @Column(name = "product_id")
//    private long name;
//
//    @Column(name = "total")
//    private double ;
//
//    public Order() {
//    }
//
//    public Order(long productId, long amount) {
//        this.productId = productId;
//        this.amount = amount;
//    }
//
//    public long getProductId() {
//        return productId;
//    }
//
//    public void setProductId(long productId) {
//        this.productId = productId;
//    }
//
//    public long getAmount() {
//        return amount;
//    }
//
//    public void setAmount(long amount) {
//        this.amount = amount;
//    }
}
