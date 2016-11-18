package com.hcl.model;

public class ShopInfo {
	private String shopId;
	private String shopName;
	private ShopAddress shopAddress;
	
	public ShopInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopInfo(String shopId, String shopName, ShopAddress shopAddress) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
	}	
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public ShopAddress getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(ShopAddress shopAddress) {
		this.shopAddress = shopAddress;
	}
	@Override
	public String toString() {
		return "ShopInfo [shopId=" + shopId + ", shopName=" + shopName + ", getShopNumber=" + shopAddress.getShopNumber() + " , getPostalCode=" + shopAddress.getPostalCode()+ " , getLatitude=" + shopAddress.getLatitude() + " , getLongitude=" + shopAddress.getLongitude()+ "]";
	}
	
	
	
}
