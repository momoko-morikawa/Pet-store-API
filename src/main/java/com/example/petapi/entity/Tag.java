package com.example.petapi.entity;

import lombok.Data;

@Data
public class Tag{
	private int id;
	private String name;
	
	public Tag() {
		
	}

	public Tag(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}