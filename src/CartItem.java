/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CartItem {
    private String name;
    private double price;
    private int quantity;
    private double discount;

    // Constructor that accepts name, price, quantity, and discount
    public CartItem(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    // Setter methods
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total price after discount
    public double getTotalPrice() {
        double total=0.0;
        total = (price-discount) * quantity;
        return total;
    }
}
