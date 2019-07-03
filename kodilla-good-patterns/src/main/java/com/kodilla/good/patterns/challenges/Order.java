package com.kodilla.good.patterns.challenges;

public class Order {
    private User user;
    private  Product product;

    public Order(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
