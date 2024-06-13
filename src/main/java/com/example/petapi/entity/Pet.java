package com.example.petapi.entity;

import com.example.petapi.enums.Status;

import lombok.Data;

@Data
public class Pet {
	private int id;
	private Category category;
	private String name;
	private String[] photoUrls;
	private Tags[] tags;
	private Status status;
	
	public Pet() {
		
	}

	public Pet(int id, Category category, String name, String[] photoUrls, Tags[] tags, Status status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	
	
	
	
}
