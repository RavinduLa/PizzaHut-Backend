package com.pizzahut.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzahut.dal.model.PizzaModel;
import com.pizzahut.domain.PizzaDataAdapter;

@Service
public class PizzaApi {
	
	private PizzaDataAdapter pizzaDataAdapter;
	
	@Autowired
	public PizzaApi(PizzaDataAdapter pizzaDataAdapter) {
		this.pizzaDataAdapter = pizzaDataAdapter;
	}
	
	public String addPiza(PizzaModel pizzaModel) {
		return pizzaDataAdapter.addPizza(pizzaModel);
	}
	
	public List<PizzaModel> getAllPizzas(){
		return pizzaDataAdapter.getAll();
	}

}
