package com.smart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smart.entities.AddSubsubCategoryEntity;


public interface SubsubCategoryService {
	List<AddSubsubCategoryEntity> getAllsubsubCategory = new ArrayList<AddSubsubCategoryEntity>();
	Object getAlladdsubsubCategory();

	
	/* Delete the data of sub sub category */
	
	void deleteSubSubById(int id);
}
