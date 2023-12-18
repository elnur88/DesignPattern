package com.company.DesignPattern.BuilderPattern;

public class Order {

    private String customerName;
    private String shippingAddress;
    private String orderedItems;
    private boolean isGift;

    private Order(String customerName, String shippingAddress, String orderedItems, boolean isGift) {
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.orderedItems = orderedItems;
        this.isGift = isGift;
    }

    public void display() {
        System.out.println("Order Details:");
        System.out.println("Customer: " + customerName);
        System.out.println("Shipping Address: " + shippingAddress);
        System.out.println("Ordered Items: " + orderedItems);
        System.out.println("Is Gift: " + isGift);
    }

    static class Builder {
        private String customerName;
        private String shippingAddress;
        private String orderedItems;
        private boolean isGift;

        Builder(String customerName, String shippingAddress, String orderedItems) {
            this.customerName = customerName;
            this.shippingAddress = shippingAddress;
            this.orderedItems = orderedItems;
        }

        Builder withGift(boolean isGift) {
            this.isGift = isGift;
            return this;
        }

        Order build() {
            return new Order(customerName, shippingAddress, orderedItems, isGift);
        }
    }
}
