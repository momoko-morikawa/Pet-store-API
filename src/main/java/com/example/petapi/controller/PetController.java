package com.example.petapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.petapi.dto.CategoryResponse;
import com.example.petapi.dto.PetResponse;
import com.example.petapi.dto.TagResponse;
import com.example.petapi.entity.Pet;
import com.example.petapi.mapper.PetMapper;

@Controller
@RequestMapping("pets")
public class PetController {
    
    @Autowired
    PetMapper petMapper;
    
    @GetMapping
    @ResponseBody
    public List<PetResponse> showAll() {
        List<PetResponse> petResponseList = new ArrayList<>();
        List<Pet> petList = petMapper.showAll();
        
        petList.forEach(pet -> {
            PetResponse petResponse = new PetResponse();
            BeanUtils.copyProperties(pet, petResponse); 
            
            
            // カテゴリのマッピング
            if (pet.getCategory() != null) {
                CategoryResponse categoryResponse = new CategoryResponse();
                BeanUtils.copyProperties(pet.getCategory(), categoryResponse);
                petResponse.setCategory(categoryResponse);
            }
            
            // タグのマッピング
            if (pet.getTags() != null && !pet.getTags().isEmpty()) {
            	List<TagResponse> tagsResponseList = new ArrayList<>();
            	pet.getTags().forEach(tag -> {
            	    TagResponse tagResponse = new TagResponse();
            	    BeanUtils.copyProperties(tag, tagResponse);
            	    tagsResponseList.add(tagResponse);
            	});
            	petResponse.setTags(tagsResponseList);
            }
            
            petResponseList.add(petResponse);
        });
        
        return petResponseList;
    }
}
