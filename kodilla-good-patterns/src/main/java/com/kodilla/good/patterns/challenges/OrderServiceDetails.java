package com.kodilla.good.patterns.challenges;

public class OrderServiceDetails implements OrderService {
    @Override
    public boolean createOrder(User user, Product product) {
        System.out.println("User's order " + user.getName() + " " + user.getSurname() +
                " Product " + product.getProductName() + " it was accepted");
        return true;
    }
}
