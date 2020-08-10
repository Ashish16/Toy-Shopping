package com.online.toy.shopping;

import java.util.HashMap;
import java.util.Map;

public class ToyShoppingDemo {

	public static void main(String[] args) {
		//Sample Toy and count of Toy Available in a Shop
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 10);
		map.put("C", 5);
		map.put("D", 3);
		map.put("E", 0);
		Shopping shopping=new Shopping();
		//Method Call By passing Toy and Price Map and given amount. 
		System.out.println("Total Toy :"+shopping.shopToy(map, 25));

	}

}
