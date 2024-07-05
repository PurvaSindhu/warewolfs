package com.xworkz.showroom.dto;

public class ShowRoomDto {
	
	private String name;
	private int price;
	private String carName;
	private int noOfCars;
	
	public ShowRoomDto(String name, int price, String carName, int noOfCars) {
		super();
		this.name = name;
		this.price = price;
		this.carName = carName;
		this.noOfCars = noOfCars;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getNoOfCars() {
		return noOfCars;
	}
	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfCars;
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
		ShowRoomDto other = (ShowRoomDto) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfCars != other.noOfCars)
			return false;
		if (price != other.price)
			return false;
		return true;
		
	}
	@Override
	public String toString() {
		return "ShowRoomDto [name=" + name + ", price=" + price + ", carName=" + carName + ", noOfCars=" + noOfCars
				+ "]";
	}
	
	

}
