package com.smart.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subcatagory")
public class AddsubcatagoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String catagoryname;
	private String subcatagoryname;
	private String username;
	
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
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "AddsubcatagoryEntity [id=" + id + ", catagoryname=" + catagoryname + ", subcatagoryname="
				+ subcatagoryname + ", username=" + username + "]";
	}
	
}
