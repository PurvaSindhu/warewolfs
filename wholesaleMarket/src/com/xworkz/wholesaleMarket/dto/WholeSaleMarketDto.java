package com.xworkz.wholesaleMarket.dto;

public class WholeSaleMarketDto {
	
	private String wholesale;
	private String dresses;
	private int price;
	private int discount;
	
	public WholeSaleMarketDto(String wholesale, String dresses, int price, int discount) {
		super();
		this.wholesale = wholesale;
		this.dresses = dresses;
		this.price = price;
		this.discount = discount;
	}
	public String getWholesale() {
		return wholesale;
	}
	public void setWholesale(String wholesale) {
		this.wholesale = wholesale;
	}
	public String getDresses() {
		return dresses;
	}
	public void setDresses(String dresses) {
		this.dresses = dresses;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "WholeSaleMarketDto [wholesale=" + wholesale + ", dresses=" + dresses + ", price=" + price
				+ ", discount=" + discount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + discount;
		result = prime * result + ((dresses == null) ? 0 : dresses.hashCode());
		result = prime * result + price;
		result = prime * result + ((wholesale == null) ? 0 : wholesale.hashCode());
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
		WholeSaleMarketDto other = (WholeSaleMarketDto) obj;
		if (discount != other.discount)
			return false;
		if (dresses == null) {
			if (other.dresses != null)
				return false;
		} else if (!dresses.equals(other.dresses))
			return false;
		if (price != other.price)
			return false;
		if (wholesale == null) {
			if (other.wholesale != null)
				return false;
		} else if (!wholesale.equals(other.wholesale))
			return false;
		return true;
	}
	
}
