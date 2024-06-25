package com.xworkz.chairs.Dto;

public class ChairCollectionDto {
	
	private int numberOfChairs;
	private String brand;
	private int price;
	private boolean quality;
	
	
	public ChairCollectionDto(int numberOfChairs, String brand, int price, boolean quality) {
		super();
		this.numberOfChairs = numberOfChairs;
		this.brand = brand;
		this.price = price;
		this.quality = quality;
	}
	
	public int getNumberOfChairs() {
		return numberOfChairs;
	}
	public void setNumberOfChairs(int numberOfChairs) {
		this.numberOfChairs = numberOfChairs;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "ChairCollectionDto [numberOfChairs=" + numberOfChairs + ", brand=" + brand + ", price=" + price
				+ ", quality=" + quality + "]";
	}
	
	
	

}
