package com.online.toy.shopping;

/*
 * Enum to use provide value for Toy
 * If required we can Add more value to it
 */
public enum ToyPrice {
	// This will call enum constructor with one String argument toy Name and Price
	A("5"), B("1"), C("3"), D("2"), E("8");
	// declaring private variable for getting values
	private String price;

	// getter method
	public String getPrice() {
		return this.price;
	}

	// enum constructor - cannot be public or protected
	private ToyPrice(String price) {
		this.price = price;
	}

}
