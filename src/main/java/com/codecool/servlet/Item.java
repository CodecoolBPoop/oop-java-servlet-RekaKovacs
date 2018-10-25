package com.codecool.servlet;

public class Item {
    private static Integer idCounter = 0;
    private Integer id;
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
        idCounter++;
        id = idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }
}

