package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process (final Order order) {
        boolean isOrdered = orderService.createOrder(order.getUser(), order.getProduct());
        if (isOrdered) {
            informationService.inform(order.getUser());
            orderRepository.addToRepository(order);
            return new OrderDto(order.getUser(), order.getProduct(), true);

        } else {
            return new OrderDto(order.getUser(), order.getProduct(), false);
        }
    }
}
