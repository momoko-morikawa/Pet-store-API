package com.example.petapi.dto;

import com.example.petapi.entity.Category;
import com.example.petapi.entity.Tags;

import lombok.Data;

@Data
public class PetResponse {
	private int id;
	private Category category;
	private String name;
	private String[] photoUrls;
	private Tags[] tags;
	private String status;
}
