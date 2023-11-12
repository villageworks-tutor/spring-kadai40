package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Item;

@Controller
public class CartController {
	// 初期表示
	@GetMapping("/cart")
	public String showCart() {
		return "cart";
	}
	
	@PostMapping("/cart/add")
	public String addCart(
			@RequestParam("name") String name,
			@RequestParam("price") int price,
			Model model) {
		// リクエストパラメータをもとに商品クラスのインスタンスを生成
		Item item = new  Item(name, price);
		//商品クラスのインスタンスをスコープに登録
		model.addAttribute("item", item);
		// 画面遷移
		return "cart";
	}
}
