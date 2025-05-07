package util;

import models.Order;

public class ReportGenerator {

    public void printOrderSummary(Order order) {
        ReportGenerator generator = new ReportGenerator();
        this.printHeader(order.customerName());
        for (String item : order.items()) {
            this.printLineItem(item);
        }
        this.printTotal(order.total());
    }

    public void printHeader(String customer) {
        System.out.println("Order for: " + customer);
    }

    public void printLineItem(String item) {
        System.out.println(" - Item: " + item);
    }

    public void printTotal(double total) {
        System.out.println("Total: $" + total);
    }
}