package com.kodilla.kodillapatterns2.facade;

public class Item {
    private final Long productId;
    private final double qty;
    private static int number = 0;

    public Item (Long productId, double gty) {
        this.productId = productId;
        this.qty = gty;
        number++;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
