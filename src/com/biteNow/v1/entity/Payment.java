package com.biteNow.v1.entity;

public class Payment {

    String name;
    private double amount;
    private String paymentType;
    private String paymentStatus;

    public Payment(String name, double amount, String paymentType, String paymentStatus) {
        this.name = name;
        this.amount = amount;
        this.paymentType = paymentType;
        this.paymentStatus = paymentStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", paymentType='" + paymentType + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
