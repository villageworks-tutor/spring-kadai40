package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Cart {
	
	/**
	 * フィールド：商品リスト
	 */
	private List<Item> itemList = new ArrayList<Item>();

	/**
	 * 商品リストを取得する
	 * @return 商品リスト
	 */
	public List<Item> getItemList() {
		return itemList;
	}
	
}
