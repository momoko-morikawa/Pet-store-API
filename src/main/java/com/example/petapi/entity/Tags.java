package com.example.petapi.entity;

import lombok.Data;

@Data
public class Tags {
	private int tags_id;
	private String tags_name;
	
	Tags(){
		
	}
	
	Tags(int tags_id, String tags_name) {
		
	}
}
