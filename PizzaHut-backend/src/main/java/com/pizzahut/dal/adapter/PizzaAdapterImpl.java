package com.pizzahut.dal.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pizzahut.dal.model.PizzaModel;
import com.pizzahut.dal.repository.PizzaRepository;
import com.pizzahut.domain.PizzaDataAdapter;

@Component
public class PizzaAdapterImpl implements PizzaDataAdapter {
	
	private PizzaRepository pizzaRepo;
	
	@Autowired
	public PizzaAdapterImpl(PizzaRepository pizzaRepo) {
		this.pizzaRepo = pizzaRepo;
	}

	@Override
	public String addPizza(PizzaModel pizza) {
		return pizzaRepo.save(pizza).getId();
	}

	@Override
	public List<PizzaModel> getAll() {
		return pizzaRepo.findAll();
	}

}
