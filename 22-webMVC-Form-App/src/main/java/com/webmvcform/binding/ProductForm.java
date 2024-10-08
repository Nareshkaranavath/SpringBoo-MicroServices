package com.webmvcform.binding;

public class ProductForm {

	private String name;
	private String quantity;
	private String price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductForm [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
