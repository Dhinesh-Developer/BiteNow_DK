package com.biteNow.v1.entity;

public class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private double rating;

    public Restaurant(int restaurantId, String restaurantName, double rating) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.rating = rating;
    }

    public Restaurant() {
    }

    public int getRestaurantId() {
        return restaurantId;
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
                '}';
    }
}
