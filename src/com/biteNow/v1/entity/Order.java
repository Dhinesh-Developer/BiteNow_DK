package com.biteNow.v1.entity;

import java.util.List;

public class Order {

    private String username;
    private double amount;
    private String orderStatus;
    private List<Menu> menus;

    public Order(String username, double amount, String orderStatus, List<Menu> menus) {
        this.username = username;
        this.amount = amount;
        this.orderStatus = orderStatus;
        this.menus = menus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "username='" + username + '\'' +
                ", amount=" + amount +
                ", orderStatus='" + orderStatus + '\'' +
                ", menus=" + menus +
                '}';
    }
}
