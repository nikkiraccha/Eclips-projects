package com.sathya;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Date;

import javax.servlet.http.Part;

public class Product {
	private String proId;
	private String proName;
	private double proPrice;
	private String proBrand;
	private String madeIn;
	private Date  proMfgDate;
	private Date proExpDate;
	private InputStream image;
	
	private byte[] readImage;
	public String getReadImage() {
		return Base64.getEncoder().encodeToString(readImage);
	}
	public void setReadImage(byte[] readImage)
	{
		this.readImage=readImage;
	}
	
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public Date getProMfgDate() {
		return proMfgDate;
	}
	public void setProMfgDate(Date proMfgDate) {
		this.proMfgDate = proMfgDate;
	}
	public Date getProExpDate() {
		return proExpDate;
	}
	public InputStream getImage() {
		return image;
	}
	public void setImage(InputStream image) {
		this.image = image;
	}
	public void setProExpDate(Date proExpDate) {
		this.proExpDate = proExpDate;
	}
	
	
	
}
