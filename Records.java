// Name - Amanjot Singh
// Date - 2 April 2024
// Description - A java application that keeps record of the stored products and display the data and information of the stored products.

import java.util.ArrayList;
import java.util.List;

// Creating a Product class to keep the record for the perishable products.
class Product {
    private int sku;
    private String name;
    private double unitCost;
    private int quantityOnHand;
    private int quantityNeeded;
    private String specialInstructions;

    // Default constructor
    public Product() {
        this.sku = 0;
        this.name = "Unknown";
        this.unitCost = 0.0;
        this.quantityOnHand = 0;
        this.quantityNeeded = 0;
        this.specialInstructions = "None";
    }

    // Parameterized constructor
    public Product(int sku, String name, double unitCost, int quantityOnHand, int quantityNeeded, String specialInstructions) {
        this.sku = sku;
        this.name = name;
        this.unitCost = unitCost;
        this.quantityOnHand = quantityOnHand;
        this.quantityNeeded = quantityNeeded;
        this.specialInstructions = specialInstructions;
    }

    // Getter methods
    public int getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    // Setter methods
    public void setSku(int sku) {
        this.sku = sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Display method
    public void display() {
        System.out.println("SKU: " + sku);
        System.out.println("Product Name: " + name);
        System.out.println("Unit Cost: $" + unitCost);
        System.out.println("Quantity on Hand: " + quantityOnHand);
        System.out.println("Quantity Needed: " + quantityNeeded);
        System.out.println("Special Instructions: " + specialInstructions);
    }
}

// PerishableProduct class showing the perishable products taking inheritence from the product class.
class PerishableProduct extends Product {
    private String expiryDate;

    // Default constructor
    public PerishableProduct() {
        super();
        this.expiryDate = "Unknown";
    }

    // Parameterized constructor
    public PerishableProduct(int sku, String name, double unitCost, int quantityOnHand, int quantityNeeded, String specialInstructions, String expiryDate) {
        super(sku, name, unitCost, quantityOnHand, quantityNeeded, specialInstructions);
        this.expiryDate = expiryDate;
    }

    // Getter method for expiry date
    public String getExpiryDate() {
        return expiryDate;
    }

    // Setter method for expiry date
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Display method
    @Override
    public void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

// Main class
public class Records {
    public static void main(String[] args) {
        // Creating different products and setting their information and data
        Product product1 = new Product(01, "Speakers", 499.99, 15, 10, "Keep away from water.");
        Product product2 = new Product(02, "Mobile Phone", 1199.99, 20, 15, "Water resistant.");
        Product product3 = new Product(03, "Smart TV", 579.99, 25, 20, "Handle with Care");

        // Creating perishable products and setting their information and data
        PerishableProduct perishableProduct1 = new PerishableProduct(04, "Fish", 6.99, 55, 10, "Keep frozen.", "2024-04-20");
        PerishableProduct perishableProduct2 = new PerishableProduct(05, "Egg", 2.79, 44, 15, "Store it in a cool and dry place.", "2024-04-22");

        // Making a array to contain the list of all products
        List<Product> allProducts = new ArrayList<>();

        // Adding the products to the array 
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(perishableProduct1);
        allProducts.add(perishableProduct2);

        // Finally displaying details of all the products
        System.out.println("Details of all products:");
        for (Product product : allProducts) {
            product.display();
            System.out.println();
        }
    }
}
