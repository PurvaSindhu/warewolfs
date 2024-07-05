package com.xworkz.chocolate.dto;

public class ChocolateDto {
	
	private String dairyMilk;
	private String chocoBar;
	private String milkybar;
	private int price;
	public ChocolateDto(String dairyMilk, String chocoBar, String milkybar, int price) {
		super();
		this.dairyMilk = dairyMilk;
		this.chocoBar = chocoBar;
		this.milkybar = milkybar;
		this.price = price;
	}
	public String getDairyMilk() {
		return dairyMilk;
	}
	public void setDairyMilk(String dairyMilk) {
		this.dairyMilk = dairyMilk;
	}
	public String getChocoBar() {
		return chocoBar;
	}
	public void setChocoBar(String chocoBar) {
		this.chocoBar = chocoBar;
	}
	public String getMilkybar() {
		return milkybar;
	}
	public void setMilkybar(String milkybar) {
		this.milkybar = milkybar;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(String munch) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ChocolateDto [dairyMilk=" + dairyMilk + ", chocoBar=" + chocoBar + ", milkybar=" + milkybar + ", price="
				+ price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chocoBar == null) ? 0 : chocoBar.hashCode());
		result = prime * result + ((dairyMilk == null) ? 0 : dairyMilk.hashCode());
		result = prime * result + ((milkybar == null) ? 0 : milkybar.hashCode());
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
		ChocolateDto other = (ChocolateDto) obj;
		if (chocoBar == null) {
			if (other.chocoBar != null)
				return false;
		} else if (!chocoBar.equals(other.chocoBar))
			return false;
		if (dairyMilk == null) {
			if (other.dairyMilk != null)
				return false;
		} else if (!dairyMilk.equals(other.dairyMilk))
			return false;
		if (milkybar == null) {
			if (other.milkybar != null)
				return false;
		} else if (!milkybar.equals(other.milkybar))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	

}
