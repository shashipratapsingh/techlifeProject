package com.smart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smart.entities.AddSubsubCategoryEntity;
import com.smart.repository.SubsubcatetoryRepository;

@Service
public class SubsubCategoryServiceImpl implements SubsubCategoryService{

	@Autowired
	private SubsubcatetoryRepository subsubcatetoryRepository;
	
	@Override
	public List<AddSubsubCategoryEntity> getAlladdsubsubCategory() {
		return subsubcatetoryRepository.findAll();
	}

/* For Delete the sub Sub category */
	@Override
	public void deleteSubSubById(int id) {
		this.subsubcatetoryRepository.deleteAll();
		
		
	}
	
	
	
	
	

}
