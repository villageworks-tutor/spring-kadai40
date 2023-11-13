package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Cart;
import com.example.demo.model.Item;

import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {

	@Autowired
	HttpSession session;
	
	@Autowired
	Cart cart;
	
	// 初期表示
	@GetMapping("/cart")
	public String showCart() {
		return "cart";
	}
	
	// 商品追加処理
	@PostMapping("/cart/add")
	public String addCart(
			@RequestParam("name") String name,
			@RequestParam("price") int price,
			Model model) {
		// リクエストパラメータをもとに商品クラスのインスタンスを生成
		Item item = new  Item(name, price);
		// セッションスコープに登録されているカートの商品リストを種痘
		List<Item> itemList = cart.getItemList();
		// 商品インスタンスを商品リストに追加
		itemList.add(item);
		//商品リストをスコープに登録
		model.addAttribute("itemList", itemList);
		// 画面遷移
		return "cart";
	}
}
