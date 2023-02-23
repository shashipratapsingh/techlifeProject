package com.smart.service;

import java.util.ArrayList;
import java.util.List;

import com.smart.entities.addcatagoryEntity;

public interface AddCategoryService {
	List<addcatagoryEntity> getAllcategory = new ArrayList<addcatagoryEntity>();
	Object getAlladdCategoryEntity();
	
	
/* Delete the data of  category */
	
	void deletecategoryById(int id);

}
