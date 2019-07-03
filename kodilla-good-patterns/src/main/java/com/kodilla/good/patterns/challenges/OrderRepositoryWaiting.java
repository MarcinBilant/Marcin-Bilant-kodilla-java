package com.kodilla.good.patterns.challenges;

public class OrderRepositoryWaiting implements  OrderRepository {
    @Override
    public void addToRepository(Order order) {
        System.out.println("Order has been add to repository");
    }
}
