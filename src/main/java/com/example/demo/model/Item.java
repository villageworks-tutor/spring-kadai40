package com.example.demo.model;

public class Item {

	/**
	 * フィールド
	 */
	private String name; // 商品名
	private int price;   // 価格
	
	/**
	 * コンストラクタ
	 * @param name  商品名
	 * @param price 価格
	 */
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
