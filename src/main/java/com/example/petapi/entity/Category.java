package com.example.petapi.entity;

import lombok.Data;

@Data
public class Category {
	private int id;
	private String name;
	
	public Category() {
		
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
