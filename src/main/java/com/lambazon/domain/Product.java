package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);

        if (quantity < 0){
           // Condition for negative quantity
            quantity = 0;
            // Set quantity at 0 when condition is true that means negative quantity entered
        }
        setQuantity(quantity);

        if (price < 0){
			// Condition for negative price
        	price = 0;
			// Set price at 0 when condition is true that means negative price entered
        }
        if (price > 1000){
			// Condition for price strictly above 1000
            price = 1000;
            // set price at 1000 when condition is true that means price strictly entered above 1000
        }
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
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
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