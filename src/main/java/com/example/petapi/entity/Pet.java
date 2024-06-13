package com.example.petapi.entity;

import java.util.List;

import lombok.Data;

@Data
public class Pet {
	private int id;
	private Category category;
	private String name;
	private List<String> photoUrls;
	private List<Tags> tags;
	private String status;
	
	public Pet() {
		
	}

	public Pet(int id, Category category, String name, List<String> photoUrls, List<Tags> tags, String status) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	
	
	
	
}
