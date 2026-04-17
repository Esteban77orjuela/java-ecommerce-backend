package com.ecommerce.model;

public class Order {

    private int id;
    private User user;
    private Product product;
    private int quantity;
    private double total;
    private String status;

    public Order(int id, User user, Product product, int quantity, double total, String status) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.total = total;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                ", total=" + total +
                ", status='" + status + '\'' +
                '}';
    }
}