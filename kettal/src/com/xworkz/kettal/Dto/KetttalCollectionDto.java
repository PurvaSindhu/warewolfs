package com.xworkz.kettal.Dto;

public class KetttalCollectionDto {
	
	private int numberOfKettals;
	private String brand;
	private String purpose;
	private int price;
	
	
	public KetttalCollectionDto(int numberOfKettals, String brand, String purpose, int price) {
		super();
		this.numberOfKettals = numberOfKettals;
		this.brand = brand;
		this.purpose = purpose;
		this.price = price;
	}


	public int getNumberOfKettals() {
		return numberOfKettals;
	}


	public void setNumberOfKettals(int numberOfKettals) {
		this.numberOfKettals = numberOfKettals;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "KetttalCollectionDto [numberOfKettals=" + numberOfKettals + ", brand=" + brand + ", purpose=" + purpose
				+ ", price=" + price + "]";
	}
	
	

}
