package com.codecool.servlet;

import java.util.ArrayList;
import java.util.List;

public class ItemStore {
    private static List<Item> listOfItems = new ArrayList<>();

    public void addItem(Item item) {
        listOfItems.add(item);
    }

    public void removeItem(Item item) {
        listOfItems.remove(item);
    }
}
