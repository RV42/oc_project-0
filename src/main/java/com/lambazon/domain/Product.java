package com.lambazon.domain;

public class Product {

    private Integer id;
    private String name, description, details;
    private int quantity;
    private double price;

    public Product(int id, int quantity, double price, String name, String description) {
        setId(id);
        setQuantity(quantity);
        setPrice(price);
        setName(name);
        setDescription(description);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        if (quantity < 0)
            // Condition for negative quantity
            quantity = 0;
        // Set quantity at 0 when condition is true that means negative quantity entered
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price)
            // Set the product price
    {
        if( price >= 0 && price <= 1000)
        // Case as price is between (included as well) 0 and 1000
        {
            this.price = price;
            // The initial price is kept if condition is true
        }
        else if( price < 0)
        // Case as price is strictly negative below 0
        {
            price = 0;
            // The price equals 0 if condition is true
        }
        else if( price > 1000)
        // Case as price is strictly over 1000
        {
            price = 1000;
            // The price equals 1000 if condition is true
        }

        this.price = price;

    }



	public double getInventoryPrice() {


	double inventoryPrice;
	// Create the variable inventoryPrice in decimal number of a product
		inventoryPrice = quantity * price;
    // It gives the total price by product type making the multiplication = number of products by standard price
		return inventoryPrice;
	}
}