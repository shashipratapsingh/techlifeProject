package com.smart.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="subsubcategory")
public class AddSubsubCategoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String catagoryname; 
	private String subcatagoryname;
	private String subsubcatagoryname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatagoryname() {
		return catagoryname;
	}
	public void setCatagoryname(String catagoryname) {
		this.catagoryname = catagoryname;
	}
	public String getSubcatagoryname() {
		return subcatagoryname;
	}
	public void setSubcatagoryname(String subcatagoryname) {
		this.subcatagoryname = subcatagoryname;
	}
	public String getSubsubcatagoryname() {
		return subsubcatagoryname;
	}
	public void setSubsubcatagoryname(String subsubcatagoryname) {
		this.subsubcatagoryname = subsubcatagoryname;
	}
	@Override
	public String toString() {
		return "AddSubsubCategory [id=" + id + ", catagoryname=" + catagoryname + ", subcatagoryname=" + subcatagoryname
				+ ", subsubcatagoryname=" + subsubcatagoryname + "]";
	}
	
	

}
