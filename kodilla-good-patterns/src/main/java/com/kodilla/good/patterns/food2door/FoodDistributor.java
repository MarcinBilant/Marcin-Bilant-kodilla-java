package com.kodilla.good.patterns.food2door;

public interface FoodDistributor {

    OrderDTO process(Order order);
        String getDistributorName();

}
