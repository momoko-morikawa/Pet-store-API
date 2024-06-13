package com.example.petapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.petapi.entity.Pet;

@Mapper
public interface PetMapper {
	
	List<Pet> showAll(); 
	
	void addPet(Pet pet);
	
}
