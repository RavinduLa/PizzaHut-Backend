package com.pizzahut.domain;

import java.util.List;

import com.pizzahut.dal.model.PizzaModel;

public interface PizzaDataAdapter {
	
	public String addPizza(PizzaModel pizza);
	public List<PizzaModel> getAll();

}
