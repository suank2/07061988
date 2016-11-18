package com.hcl.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ShopInfo")
public class ShopInfoEntityBean implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="shopId")
	private String shopId;
	@Column(name="shopName")
	private String shopName;
	@Column(name="shopNumber")
	private String shopNumber;
	@Column(name="postalCode")
	private String postalCode;
	@Column(name="latitude")
	private String latitude;
	@Column(name="longitude")
	private String longitude;
	public ShopInfoEntityBean() {
		super();
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	//http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopNumber() {
		return shopNumber;
	}
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	
}
