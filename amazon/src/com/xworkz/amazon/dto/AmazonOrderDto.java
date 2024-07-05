package com.xworkz.amazon.dto;

public class AmazonOrderDto {
	
	private String ownerId;
	private String brand;
	private int numberOfOrders;
	private int price;
	
	public AmazonOrderDto(String ownerId, String brand, int numberOfOrders, int price) {
		super();
		this.ownerId = ownerId;
		this.brand = brand;
		this.numberOfOrders = numberOfOrders;
		this.price = price;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNumberOfOrders() {
		return numberOfOrders;
	}
	public void setNumberOfOrders(int numberOfOrders) {
		this.numberOfOrders = numberOfOrders;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "AmazonOrderDto [ownerId=" + ownerId + ", brand=" + brand + ", numberOfOrders=" + numberOfOrders
				+ ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + numberOfOrders;
		result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AmazonOrderDto other = (AmazonOrderDto) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (numberOfOrders != other.numberOfOrders)
			return false;
		if (ownerId == null) {
			if (other.ownerId != null)
				return false;
		} else if (!ownerId.equals(other.ownerId))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	

}
