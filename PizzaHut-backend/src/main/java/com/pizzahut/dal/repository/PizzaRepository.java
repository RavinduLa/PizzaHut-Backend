package com.pizzahut.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pizzahut.dal.model.PizzaModel;

public interface PizzaRepository extends MongoRepository<PizzaModel, String> {

}
