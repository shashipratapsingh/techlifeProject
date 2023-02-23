package com.smart.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addcatagory")

public class addcatagoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="addCatagory", unique=true)
	private String addCatagory;
	private String addUnit;
	
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddCatagory() {
		return addCatagory;
	}
	public void setAddCatagory(String addCatagory) {
		this.addCatagory = addCatagory;
	}
	public String getAddUnit() {
		return addUnit;
	}
	public void setAddUnit(String addUnit) {
		this.addUnit = addUnit;
	}
	public String  getUsername() {
		return username;
	}
	public void setUsername(String user) {
		this.username = user;
	}
	@Override
	public String toString() {
		return "addcatagoryEntity [id=" + id + ", addCatagory=" + addCatagory + ", addUnit=" + addUnit + ", username="
				+ username + "]";
	}
	
	
	
	

}
