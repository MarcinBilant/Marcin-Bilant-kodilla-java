package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Order> ordersList = new ArrayList<>();

        FoodDistributor extraFoodShop = new ExtraFoodShop();
        FoodDistributor glutenFreeShop = new GlutenFreeShop();
        FoodDistributor healthyShop = new HealthyShop();

        Product cheese = new Product("Cheese");
        Product pasta = new Product("Pasta");
        Product lettuce = new Product("Lettuce");

        Order order1 = new Order(1,cheese,10,
                LocalDateTime.of(2019,7,2,10,2,33),extraFoodShop);
        Order order2 = new Order(2,pasta,15,
                LocalDateTime.of(2019,7,3,11,3,22),glutenFreeShop);
        Order order3 = new Order(3,lettuce,15,
                LocalDateTime.of(2019,7,4,12,4,11),healthyShop);

        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);

        for (Order order: ordersList) {
            OrderDTO orderDTO = order.getFoodDistributor().process(order);
            if (orderDTO.isOrdered()) {
                System.out.println("Information about the order:"
                        + "\ndate: " + orderDTO.getOrderTime().format(DateTimeFormatter.ISO_DATE)
                        + ", time: " + orderDTO.getOrderTime().format(DateTimeFormatter.ISO_TIME)
                        + "\nproduct: " + orderDTO.getProduct().getProductName()
                        + "\nquantity: " + orderDTO.getQuantity()
                        + "\ndistributor: " + orderDTO.getFoodDistributor().getDistributorName() + "\n");
            } else {
                System.out.println("Information about the order:"
                        + "\ndate: " + orderDTO.getOrderTime().format(DateTimeFormatter.ISO_DATE)
                        + ", time: " + orderDTO.getOrderTime().format(DateTimeFormatter.ISO_TIME)
                        + "\nproduct: " + orderDTO.getProduct().getProductName()
                        + "\nquantity: " + orderDTO.getQuantity()
                        + "\ndistributor: " + orderDTO.getFoodDistributor().getDistributorName() + "\n");
            }
        }
    }

}
