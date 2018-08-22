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

	int getQuantity() {
		return quantity;
	}

	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}


	public double getInventoryPrice() {

		/** "InventoryPrice" is the multiplication "quantity" by "price" for each item
		 The result "InventoryPrice" must be considered as a decimal number so I use "double"
		 */

	double InventoryPrice;
		InventoryPrice = quantity * price;

		return InventoryPrice;
	}
}
