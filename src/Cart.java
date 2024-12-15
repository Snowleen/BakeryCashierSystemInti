/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.List;

public class Cart {
    private List<CartItem> cartItems;  // List of CartItem objects

    // Constructor to initialize the cart with CartItems
    public Cart(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    // Getter for cartItems
    public List<CartItem> getCartItems() {
        return cartItems;
    }

    // Add a CartItem to the cart 
    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    // Calculate the total price for the cart
    public double getTotalAmount() {
        double total = 0.0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}

