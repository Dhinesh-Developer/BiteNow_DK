package com.biteNow.v1.entity;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private double rating;

    private List<Menu> items;

    public Restaurant(int restaurantId, String restaurantName, double rating,List<Menu> items) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.rating = rating;
        this.items = new ArrayList<>();
    }

    public Restaurant() {
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public List<Menu> getItems() {
        return items;
    }

    public void setItems(List<Menu> items) {
        this.items = items;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", rating=" + rating +
                ", items=" + items +
                '}';
    }
}
