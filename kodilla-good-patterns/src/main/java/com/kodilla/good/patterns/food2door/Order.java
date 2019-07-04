package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class Order {
    private int orderNumber;
    private Product product;
    private int quantity;
    private LocalDateTime orderTime;
    private FoodDistributor foodDistributor;

    public Order(int orderNumber, Product product, int quantity, LocalDateTime orderTime, FoodDistributor foodDistributor) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.quantity = quantity;
        this.orderTime = orderTime;
        this.foodDistributor = foodDistributor;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public FoodDistributor getFoodDistributor() {
        return foodDistributor;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

