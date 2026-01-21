package com.biteNow.v1.entity;

public class Menu {

    private int itemId;
    private String itemName;
    private double price;
    private boolean available;

    public Menu() {
    }

    public Menu(int itemId, String itemName, double price, boolean available) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.available = available;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
