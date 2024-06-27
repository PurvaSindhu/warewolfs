package com.xworkz.bodywash.dto;

public class BodyWashDto {
	
	private int product;
	private String name;
	private String fragrance;
	private String type;
	
	public BodyWashDto(int product, String name, String fragrance, String type) {
		super();
		this.product = product;
		this.name = name;
		this.fragrance = fragrance;
		this.type = type;
	}
	
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFragrance() {
		return fragrance;
	}
	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;	
	}
	
	@Override
	public String toString() {
		return "BodyWashDto [product=" + product + ", name=" + name + ", fragrance=" + fragrance + ", type=" + type
				+ "]";
	}
	
	

}
