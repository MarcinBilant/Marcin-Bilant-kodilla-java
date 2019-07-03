package com.kodilla.good.patterns.challenges;

public class Product {
    private int IdProduct;
    private String ProductName;

    public Product(int idProduct, String productName) {
        IdProduct = idProduct;
        ProductName = productName;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public String getProductName() {
        return ProductName;
    }
}
