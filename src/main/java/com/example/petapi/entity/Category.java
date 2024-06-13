package com.example.petapi.entity;

import lombok.Data;

@Data
public class Category {
	private int category_id;
	private String category_name;
	
	Category() {
		
	}
	
	Category(int category_id, String category_name) {
		this.category_id = category_id;
		this.category_name = category_name;
	}
}
