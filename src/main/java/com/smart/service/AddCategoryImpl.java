package com.smart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.entities.addcatagoryEntity;
import com.smart.repository.AddCatagory;



@Service
public class AddCategoryImpl implements AddCategoryService{

	@Autowired
	private AddCatagory addCatagory; 
	
	@Override
	public List<addcatagoryEntity> getAlladdCategoryEntity() {
		
		return addCatagory.findAll();
	}

	
	/* For Delete the sub Sub category */
	@Override
	public void deletecategoryById(int id) {
		this.addCatagory.deleteAll();
		
		
	}
	
	

}
