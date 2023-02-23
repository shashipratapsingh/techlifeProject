package com.smart.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companyprofile")
public class CompanyProfileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String companyname;
	private String branchaddress;
	private String city;
	private String district;
	private String pincode;
	private String states;
	private String mobileno;
	private String lendlineno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getBranchaddress() {
		return branchaddress;
	}
	public void setBranchaddress(String branchaddress) {
		this.branchaddress = branchaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getLendlineno() {
		return lendlineno;
	}
	public void setLendlineno(String lendlineno) {
		this.lendlineno = lendlineno;
	}
	@Override
	public String toString() {
		return "CompanyProfileEntity [id=" + id + ", companyname=" + companyname + ", branchaddress=" + branchaddress
				+ ", city=" + city + ", district=" + district + ", pincode=" + pincode + ", states=" + states
				+ ", mobileno=" + mobileno + ", lendlineno=" + lendlineno + "]";
	}
	
	
	
	

}
