package com.pizzahut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzahut.api.PizzaApi;
import com.pizzahut.dal.model.PizzaModel;

@RestController
@RequestMapping("/api/pizza/")
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
public class PizzaController {
	
	private PizzaApi pizzaApi;

	@Autowired
	public PizzaController(PizzaApi pizzaApi) {
		this.pizzaApi = pizzaApi;
	}
	
	@PostMapping("addPiza")
	public String addPizza(@RequestBody PizzaModel pizza) {
		return pizzaApi.addPiza(pizza);
	}
	
	@GetMapping("getAllPizzas")
	public List<PizzaModel> getAllPizza(){
		System.out.println("Returning all pizzas.");
		return pizzaApi.getAllPizzas();
	}
	
	

}
