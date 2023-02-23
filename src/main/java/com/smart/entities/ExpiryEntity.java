package com.smart.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ExpiryEntity")

public class ExpiryEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ids;
	private String expirydate;
	private String totalprice;
	public Integer getIds() {
		return ids;
	}
	public void setIds(Integer ids) {
		this.ids = ids;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ExpiryEntity [ids=" + ids + ", expirydate=" + expirydate + ", totalprice=" + totalprice + "]";
	}
	
	
	
	
	

}
