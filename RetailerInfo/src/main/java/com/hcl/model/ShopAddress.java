package com.hcl.model;

public class ShopAddress {
	private String shopNumber;
	private String postalCode;
	private String latitude;
	private String longitude;
		
	public ShopAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopAddress(String shopNumber, String postalCode, String latitude, String longitude) {
		super();
		this.shopNumber = shopNumber;
		this.postalCode = postalCode;
		this.latitude = latitude;
		this.longitude = longitude;
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
