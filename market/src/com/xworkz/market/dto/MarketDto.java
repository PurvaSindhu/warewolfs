package com.xworkz.market.dto;

public class MarketDto {
	
	private String vegetables;
	private String fruits;
	private int vegPrice;
	private int fruitsPrice;
	public MarketDto(String vegetables, String fruits, int vegPrice, int fruitsPrice) {
		super();
		this.vegetables = vegetables;
		this.fruits = fruits;
		this.vegPrice = vegPrice;
		this.fruitsPrice = fruitsPrice;
	}
	public String getVegetables() {
		return vegetables;
	}
	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}
	public String getFruits() {
		return fruits;
	}
	public void setFruits(String fruits) {
		this.fruits = fruits;
	}
	public int getVegPrice() {
		return vegPrice;
	}
	public void setVegPrice(int vegPrice) {
		this.vegPrice = vegPrice;
	}
	public int getFruitsPrice() {
		return fruitsPrice;
	}
	public void setFruitsPrice(int fruitsPrice) {
		this.fruitsPrice = fruitsPrice;
	}
	@Override
	public String toString() {
		return "MarketDto [vegetables=" + vegetables + ", fruits=" + fruits + ", vegPrice=" + vegPrice
				+ ", fruitsPrice=" + fruitsPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruits == null) ? 0 : fruits.hashCode());
		result = prime * result + fruitsPrice;
		result = prime * result + vegPrice;
		result = prime * result + ((vegetables == null) ? 0 : vegetables.hashCode());
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
		MarketDto other = (MarketDto) obj;
		if (fruits == null) {
			if (other.fruits != null)
				return false;
		} else if (!fruits.equals(other.fruits))
			return false;
		if (fruitsPrice != other.fruitsPrice)
			return false;
		if (vegPrice != other.vegPrice)
			return false;
		if (vegetables == null) {
			if (other.vegetables != null)
				return false;
		} else if (!vegetables.equals(other.vegetables))
			return false;
		return true;
	}
	
}
