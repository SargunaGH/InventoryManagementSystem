package com.inventory.system;
import java.util.Scanner;
public class InventorySystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Update Product Price");
            System.out.println("5. Remove Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String productId = sc.nextLine();
                    System.out.print("Enter product name: ");
                    String productName = sc.nextLine();
                    System.out.print("Enter product quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter product price: ");
                    double price = sc.nextDouble();
                    inventory.addProduct(productId, productName, quantity, price);
                    break;

                case 2:
                    System.out.println("\nProduct List:");
                    inventory.viewProducts();
                    break;

                case 3:
                    System.out.print("Enter product ID: ");
                    String productIdForQuantity = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();
                    inventory.updateQuantity(productIdForQuantity, newQuantity);
                    break;

                case 4:
                    System.out.print("Enter product ID: ");
                    String productIdForPrice = sc.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = sc.nextDouble();
                    inventory.updatePrice(productIdForPrice, newPrice);
                    break;

                case 5:
                    System.out.print("Enter product ID to remove: ");
                    String productIdToRemove = sc.nextLine();
                    inventory.removeProduct(productIdToRemove);
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
