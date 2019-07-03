package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        User user = new User("jkowalski","Jan","Kowalski");
        Product product = new Product(2010,"Laptop");
        Order order = new Order(user, product);
        InformationServiceSent informationService = new InformationServiceSent();
        OrderServiceDetails orderServiceDetails = new OrderServiceDetails();
        OrderRepositoryWaiting orderRepositoryWaiting = new OrderRepositoryWaiting();

        OrderProcessor orderProcessor = new OrderProcessor(informationService,orderServiceDetails,orderRepositoryWaiting);
        OrderDto orderDto = orderProcessor.process(order);

        if (orderDto.isOrdered()) {
            System.out.println("Order summary " + orderDto.getProduct().getProductName() + " has been ordered by "
                    + orderDto.getUser().getName() + " " + orderDto.getUser().getSurname());
        } else {
            System.out.println("The order  has not been accepted");
        }

    }

}
