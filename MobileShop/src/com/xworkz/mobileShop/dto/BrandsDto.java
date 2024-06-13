package com.xworkz.mobileShop.dto;

public class BrandsDto {

	public String iPhone;
	public String samgung;
	public String vivo;
	public String realMe;
	public String onePlus;
	public int numberOfPhones;
	public int profit;
	public int price;
	public boolean isStoreOpened;
	public String storeName;

	public BrandsDto() {
		System.out.println("this is constructor");
	}

	public BrandsDto(String iPhone, String samgung, String vivo, String realMe, String onePlus, int numberOfPhones,
			int profit, int price, boolean isStoreOpened,String storeName) {
		super();
		this.iPhone = iPhone;
		this.samgung = samgung;
		this.vivo = vivo;
		this.realMe = realMe;
		this.onePlus = onePlus;
		this.numberOfPhones = numberOfPhones;
		this.profit = profit;
		this.price = price;
		this.storeName=storeName;
	}

	public String getiPhone() {
		System.out.println("iPhone"+iPhone);
		return iPhone;
	}

	public void setiPhone(String iPhone) {
		this.iPhone = iPhone;
	}

	public String getSamgung() {
		System.out.println("samgung"+samgung);
		return samgung;
	}

	public void setSamgung(String samgung) {
		this.samgung = samgung;
	}

	public String getVivo() {
		System.out.println("vivo"+vivo);
		return vivo;
	}

	public void setVivo(String vivo) {
		this.vivo = vivo;
	}

	public String getRealMe() {
		System.out.println("realme"+realMe);
		return realMe;
	}

	public void setRealMe(String realMe) {
		this.realMe = realMe;
	}

	public String getOnePlus() {
		System.out.println("onePlus"+onePlus);
		return onePlus;
	}

	public void setOnePlus(String onePlus) {
		this.onePlus = onePlus;
	}

	public int getNumberOfPhones() {
		System.out.println("onePlus"+onePlus);
		return numberOfPhones;
	}

	public void setNumberOfPhones(int numberOfPhones) {
		this.numberOfPhones = numberOfPhones;
	}

	public int getProfit() {
		System.out.println("profit"+profit);
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getPrice() {
		System.out.println("price"+price);
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isStoreOpened() {
		System.out.println("isStoreOpened"+isStoreOpened);
		return isStoreOpened;
	}

	public void setStoreOpened(boolean isStoreOpened) {
		this.isStoreOpened = isStoreOpened;
	}

	public String getStoreName() {
		System.out.println("storeName"+storeName);
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@Override
	public String toString() {
		return "BrandsDto [iPhone=" + iPhone + ", samgung=" + samgung + ", vivo=" + vivo + ", realMe=" + realMe
				+ ", onePlus=" + onePlus + ", numberOfPhones=" + numberOfPhones + ", profit=" + profit + ", price="
				+ price + ", isStoreOpened=" + isStoreOpened + ", storeName=" + storeName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iPhone == null) ? 0 : iPhone.hashCode());
		result = prime * result + (isStoreOpened ? 1231 : 1237);
		result = prime * result + numberOfPhones;
		result = prime * result + ((onePlus == null) ? 0 : onePlus.hashCode());
		result = prime * result + price;
		result = prime * result + profit;
		result = prime * result + ((realMe == null) ? 0 : realMe.hashCode());
		result = prime * result + ((samgung == null) ? 0 : samgung.hashCode());
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		result = prime * result + ((vivo == null) ? 0 : vivo.hashCode());
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
		BrandsDto other = (BrandsDto) obj;
		if (iPhone == null) {
			if (other.iPhone != null)
				return false;
		} else if (!iPhone.equals(other.iPhone))
			return false;
		if (isStoreOpened != other.isStoreOpened)
			return false;
		if (numberOfPhones != other.numberOfPhones)
			return false;
		if (onePlus == null) {
			if (other.onePlus != null)
				return false;
		} else if (!onePlus.equals(other.onePlus))
			return false;
		if (price != other.price)
			return false;
		if (profit != other.profit)
			return false;
		if (realMe == null) {
			if (other.realMe != null)
				return false;
		} else if (!realMe.equals(other.realMe))
			return false;
		if (samgung == null) {
			if (other.samgung != null)
				return false;
		} else if (!samgung.equals(other.samgung))
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		if (vivo == null) {
			if (other.vivo != null)
				return false;
		} else if (!vivo.equals(other.vivo))
			return false;
		return true;
	}

}
