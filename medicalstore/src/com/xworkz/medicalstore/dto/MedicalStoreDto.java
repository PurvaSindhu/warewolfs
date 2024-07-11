package com.xworkz.medicalstore.dto;

public class MedicalStoreDto {
	
	private String tablet;
	private int price;
	private int duration;
	private String symptoms;
	public MedicalStoreDto(String tablet, int price, int duration, String symptoms) {
		super();
		this.tablet = tablet;
		this.price = price;
		this.duration = duration;
		this.symptoms = symptoms;
	}
	public String getTablet() {
		return tablet;
	}
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + price;
		result = prime * result + ((symptoms == null) ? 0 : symptoms.hashCode());
		result = prime * result + ((tablet == null) ? 0 : tablet.hashCode());
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
		MedicalStoreDto other = (MedicalStoreDto) obj;
		if (duration != other.duration)
			return false;
		if (price != other.price)
			return false;
		if (symptoms == null) {
			if (other.symptoms != null)
				return false;
		} else if (!symptoms.equals(other.symptoms))
			return false;
		if (tablet == null) {
			if (other.tablet != null)
				return false;
		} else if (!tablet.equals(other.tablet))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MedicalStoreDto [tablet=" + tablet + ", price=" + price + ", duration=" + duration + ", symptoms="
				+ symptoms + "]";
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

}
