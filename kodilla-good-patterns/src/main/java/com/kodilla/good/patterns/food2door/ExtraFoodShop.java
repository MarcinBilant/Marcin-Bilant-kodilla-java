package com.kodilla.good.patterns.food2door;



public class ExtraFoodShop implements FoodDistributor{

    @Override
    public OrderDTO process(Order order) {
        boolean isOrdered = true;

        if (isOrdered) {
            System.out.println("The order number " + order.getOrderNumber() + " has been processed.");
            return new OrderDTO(true,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        } else {
            System.out.println("The order number " + order.getOrderNumber() + " has not been processed.");
            return new OrderDTO(false,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        }
    }

    @Override
    public String getDistributorName() {
        return "Extra Food Shop";
    }

}
