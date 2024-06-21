package com.xworkz.fruit.Dto;

public class FruitsDto {
	
	public String shopName;
	public String apple;
	public int price;
	public boolean goodQuality;
	
	public FruitsDto() {
		// TODO Auto-generated constructor stub
	}
	public FruitsDto(String shopName, String apple, int price, boolean goodQuality) {
		super();
		this.shopName = shopName;
		this.apple = apple;
		this.price = price;
		this.goodQuality = goodQuality;
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getApple() {
		return apple;
	}
	public void setApple(String apple) {
		this.apple = apple;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isGoodQuality() {
		return goodQuality;
	}
	public void setGoodQuality(boolean goodQuality) {
		this.goodQuality = goodQuality;
	}
	@Override
	public String toString() {
		return "FruitsDto [shopName=" + shopName + ", apple=" + apple + ", price=" + price + ", goodQuality="
				+ goodQuality + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apple == null) ? 0 : apple.hashCode());
		result = prime * result + (goodQuality ? 1231 : 1237);
		result = prime * result + price;
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
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
		FruitsDto other = (FruitsDto) obj;
		if (apple == null) {
			if (other.apple != null)
				return false;
		} else if (!apple.equals(other.apple))
			return false;
		if (goodQuality != other.goodQuality)
			return false;
		if (price != other.price)
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		return true;
	}

}
