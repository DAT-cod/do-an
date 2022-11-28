package com.universityofscience.freshfood.dto;

public class StoreDTO {
private long storeId;
private String address;
private  String  storeName;
private long turnOver;
private long storeTypeId;
public long getStoreId() {
	return storeId;
}
public void setStoreId(long storeId) {
	this.storeId = storeId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
public long getTurnOver() {
	return turnOver;
}
public void setTurnOver(long turnOver) {
	this.turnOver = turnOver;
}
public long getStoreTypeId() {
	return storeTypeId;
}
public void setStoreTypeId(long storeTypeId) {
	this.storeTypeId = storeTypeId;
}
}
