package com.xworkz.wire.dto;

import java.util.Comparator;

public class WireDto {
	
	private String brand;
	private String quality;
	private int durability;
	private int warrenty;
	
	
	public WireDto(String brand, String quality, int durability, int warrenty) {
		super();
		this.brand = brand;
		this.quality = quality;
		this.durability = durability;
		this.warrenty = warrenty;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getQuality() {
		return quality;
	}


	public void setQuality(String quality) {
		this.quality = quality;
	}


	public int getDurability() {
		return durability;
	}


	public void setDurability(int durability) {
		this.durability = durability;
	}


	public int getWarrenty() {
		return warrenty;
	}


	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}


	@Override
	public String toString() {
		return "WireDto [brand=" + brand + ", quality=" + quality + ", durability=" + durability + ", warrenty="
				+ warrenty + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + durability;
		result = prime * result + ((quality == null) ? 0 : quality.hashCode());
		result = prime * result + warrenty;
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
		WireDto other = (WireDto) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (durability != other.durability)
			return false;
		if (quality == null) {
			if (other.quality != null)
				return false;
		} else if (!quality.equals(other.quality))
			return false;
		if (warrenty != other.warrenty)
			return false;
		return true;
	}
	
	//Comparator<WireDto> wire = new Comparator<WireDto>() {
		
//		@Override
//		public int compare(WireDto i, WireDto j) {
//			if (i.getDurability() > j.getDurability()) {
//				return 1;
//			}else if (i.getDurability() < j.getDurability()) {
//				return 0;
//			}
//			return -1;
//		}
//	};
//	
	
		
}




