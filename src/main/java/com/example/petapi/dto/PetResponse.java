package com.example.petapi.dto;

import java.util.List;

import lombok.Data;

@Data
public class PetResponse {
	private int id;
	private CategoryResponse category;
	private String name;
	private List<String> photoUrls;
	private List<TagResponse> tags;
	private String status;
}
