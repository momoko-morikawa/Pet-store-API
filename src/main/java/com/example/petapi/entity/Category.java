package com.example.petapi.entity;

import lombok.Data;

@Data
public class Category {
	private int id;
	private String name;
	
	Category() {
		
	}
	
	Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
