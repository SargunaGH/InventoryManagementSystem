package com.inventory.system;
import java.util.HashMap;
public class Inventory {
    private HashMap<String, Product> productList;

    public Inventory() {
        productList = new HashMap<>();
    }

    // Add product to inventory
    public void addProduct(String productId, String productName, int quantity, double price) {
        if (!productList.containsKey(productId)) {
            Product newProduct = new Product(productId, productName, quantity, price);
            productList.put(productId, newProduct);
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Product with this ID already exists.");
        }
    }

    // View all products
    public void viewProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : productList.values()) {
                System.out.println(product);
            }
        }
    }

    // Update product quantity
    public void updateQuantity(String productId, int newQuantity) {
        Product product = productList.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Update product price
    public void updatePrice(String productId, double newPrice) {
        Product product = productList.get(productId);
        if (product != null) {
            product.setPrice(newPrice);
            System.out.println("Price updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Remove product
    public void removeProduct(String productId) {
        if (productList.containsKey(productId)) {
            productList.remove(productId);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }
}
