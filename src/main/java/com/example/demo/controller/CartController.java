package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
	// 初期表示
	@GetMapping("/cart")
	public String showCart() {
		return "cart";
	}
}
