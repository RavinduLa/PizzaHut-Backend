package com.pizzahut.dal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PizzaModel {
	
	@Id
	private String id;
	private String name;
	private String range;
	private String flag;
	private String description;
	private String size;
	private String crust;
	private String topping;
	private String extras;
	
	public PizzaModel(String id, String name, String range, String flag, String description, String size, String crust,
			String topping, String extras) {
		super();
		this.id = id;
		this.name = name;
		this.range = range;
		this.flag = flag;
		this.description = description;
		this.size = size;
		this.crust = crust;
		this.topping = topping;
		this.extras = extras;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}
	
	
	
	

}
