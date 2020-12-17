package com.online.toy.shopping;

import java.util.Map;
import java.util.TreeMap;

public class Shopping {

	private Map<Integer, String> toypriceMap;
	private Map<Integer, String> toypriceMap1;
	int amount;

	public int getAmount() {
		return amount;
	}

	/**
	 * Constructor to set value for Amount
	 * 
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * This method will provide the max number of toys one could buy for a given the
	 * number of toys for each variety in a toy shop, and given an amount R.
	 * 
	 * @param toy
	 * @param amount
	 * @return
	 */
	@SuppressWarnings("unlikely-arg-type")
	public int shopToy(Map<String, Integer> toy, int amount) {
		if (toy.isEmpty() || amount <= 0) {
			return 0;
		}
		populateToyPriceMap();
		setAmount(amount);
		int count = 0;
		for (int toyPrice : toypriceMap.keySet()) {
			if (toy.containsKey(toypriceMap.get(toyPrice)) && amount > 0) {
				count += getToyCount(toy.get(toypriceMap.get(toyPrice)), toyPrice);
			}
		}

		return count;
	}

	/**
	 * This method will return the number of toys purchased for one type.
	 * 
	 * @param toyCount
	 * @param toyPrice
	 * @return
	 */
	private int getToyCount(int toyCount, int toyPrice) {
		int count = 0;
		if (toyCount * toyPrice <= amount) {
			count += toyCount;
			amount -= toyCount * toyPrice;
		} else {
			for (int i = 0; i < toyCount; i++) {
				if (amount >= toyPrice) {
					amount -= toyPrice;
					count++;
				} else {
					break;
				}
			}
		}
		return count;

	}

	/**
	 * Metod to populate toy and price map
	 */
	private void populateToyPriceMap() {
		toypriceMap = new TreeMap<Integer, String>();
		toypriceMap1 = new TreeMap<Integer, String>();
		// - Enum values() examples
		ToyPrice[] prices = ToyPrice.values();
		for (ToyPrice price : prices) {
			toypriceMap.put(Integer.parseInt(price.getPrice()), price.name());
		}

	}
}
