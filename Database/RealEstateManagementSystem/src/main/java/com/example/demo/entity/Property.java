package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Property-28-JAN")
public class Property {

	@Id
	private int propertyId;
	
	private String propertyType;
	private long areaSqFt;
	private double price;
	private String location;
	private String status;
	
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public long getAreaSqFt() {
		return areaSqFt;
	}
	public void setAreaSqFt(long areaSqFt) {
		this.areaSqFt = areaSqFt;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}