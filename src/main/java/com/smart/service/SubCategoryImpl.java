package com.smart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smart.entities.AddsubcatagoryEntity;
import com.smart.repository.Subcatagory;

@Service
public class SubCategoryImpl implements ReportSubCategory {
	@Autowired
	private Subcatagory subcatagory;

	@Override
	public List<AddsubcatagoryEntity> getReportSubCategory() {
		return subcatagory.findAll();
	}
}
