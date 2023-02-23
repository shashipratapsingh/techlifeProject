package com.smart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class NewProductAddEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String productCode;
	private String batchno;
	private String catagoryname;
	private String subcatagoryname;
	private String subsubcatagoryname;
	private String productname;
	private String suppliername;
	private String mobileno;
	private String manufacturername;
	private String manufacturerrate;
	private String productmrp;
	private String productsalerate;
	private String productquantity;
	private String productgst;
	private String producthsncode;
	private String manufacturedate;
	/*
	 * private String expirydate; private String totalprice;
	 */
	private String username;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ExpiryEntity")
    private ExpiryEntity ExpiryEntity;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getBatchno() {
		return batchno;
	}


	public void setBatchno(String batchno) {
		this.batchno = batchno;
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


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getSuppliername() {
		return suppliername;
	}


	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	public String getManufacturername() {
		return manufacturername;
	}


	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}


	public String getManufacturerrate() {
		return manufacturerrate;
	}


	public void setManufacturerrate(String manufacturerrate) {
		this.manufacturerrate = manufacturerrate;
	}


	public String getProductmrp() {
		return productmrp;
	}


	public void setProductmrp(String productmrp) {
		this.productmrp = productmrp;
	}


	public String getProductsalerate() {
		return productsalerate;
	}


	public void setProductsalerate(String productsalerate) {
		this.productsalerate = productsalerate;
	}


	public String getProductquantity() {
		return productquantity;
	}


	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}


	public String getProductgst() {
		return productgst;
	}


	public void setProductgst(String productgst) {
		this.productgst = productgst;
	}


	public String getProducthsncode() {
		return producthsncode;
	}


	public void setProducthsncode(String producthsncode) {
		this.producthsncode = producthsncode;
	}


	public String getManufacturedate() {
		return manufacturedate;
	}


	public void setManufacturedate(String manufacturedate) {
		this.manufacturedate = manufacturedate;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public ExpiryEntity getExpiryEntity() {
		return ExpiryEntity;
	}


	public void setExpiryEntity(ExpiryEntity expiryEntity) {
		ExpiryEntity = expiryEntity;
	}


	@Override
	public String toString() {
		return "NewProductAddEntity [id=" + id + ", productCode=" + productCode + ", batchno=" + batchno
				+ ", catagoryname=" + catagoryname + ", subcatagoryname=" + subcatagoryname + ", subsubcatagoryname="
				+ subsubcatagoryname + ", productname=" + productname + ", suppliername=" + suppliername + ", mobileno="
				+ mobileno + ", manufacturername=" + manufacturername + ", manufacturerrate=" + manufacturerrate
				+ ", productmrp=" + productmrp + ", productsalerate=" + productsalerate + ", productquantity="
				+ productquantity + ", productgst=" + productgst + ", producthsncode=" + producthsncode
				+ ", manufacturedate=" + manufacturedate + ", username=" + username + ", ExpiryEntity=" + ExpiryEntity
				+ "]";
	}
	
	
	
	
	
	
	
}
	