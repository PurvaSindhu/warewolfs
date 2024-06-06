package com.xworkz.bag.things;

public class AmericanTourister {

	public int number;
	public String modal;
	public int numberOfBrands;
	public int price;
	public int tax;
	public int gst;
	public int serviceTax;
	public int bagsSelledPerDay;
	public String brandName;
	public int numberOfModals;
	public char logo;
	public String quality;
	public String ambassidor;
	public int inStock;
	public int contactInfo;

	public AmericanTourister() {
		System.out.println("this is a bag class");
	}

	public AmericanTourister(int number, String modal, int numberOfBrands, int price, int tax, int serviceTax,
			char logo, int inStock) {
		this.number = number;
		this.modal = modal;
		this.numberOfBrands = numberOfBrands;
		this.price = price;
		this.tax = tax;
		this.serviceTax = serviceTax;
		this.logo = logo;
		this.inStock = inStock;
	}

	public AmericanTourister(int bagsSelledPerDay, String brandName, int numberOfModals, String quality,
			String ambassidor, int contactInfo) {
		this.bagsSelledPerDay = bagsSelledPerDay;
		this.brandName = brandName;
		this.numberOfModals = numberOfModals;
		this.contactInfo = contactInfo;
		this.ambassidor = ambassidor;
		this.quality = quality;
		System.out.println("BagsSelledPerDay : " + this.bagsSelledPerDay+"brandName="+this.brandName+"numberOfModals="
		+this.numberOfModals+"contactInfo="+this.contactInfo+"ambassidor="+ambassidor+"this.quality="+this.quality);
    }

	public void setbagsSelledPerDay(int bagsSelledPerDay) {
		this.bagsSelledPerDay = bagsSelledPerDay;
	}

	public int getbagsSelledPerDay() {
		System.out.println("the number of selled is=" + bagsSelledPerDay);
		return bagsSelledPerDay;
	}

	public void setbrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getbrandName() {
		System.out.println("this is brand=" + brandName);
		return brandName;
	}

	public void setinfo(int numberOfModals) {
		this.numberOfModals = numberOfModals;
	}

	public int getinfo() {
		System.out.println("this is info=" + numberOfModals);
		return numberOfModals;
	}

	public void setinfo2(String quality) {
		this.quality = quality;
	}

	public String getinfo2() {
		System.out.println("this is info 2=" + quality);
		return quality;
	}

	public void setdetails(String ambassidor) {
		this.ambassidor = ambassidor;
	}

	public String getdetails() {
		return ambassidor;
	}

	public void setcontactInfo(int contactInfo) {
		this.contactInfo = contactInfo;
	}

	public int getcontactInfo() {
		System.out.println("this is details class=" + contactInfo);
		return contactInfo;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("this is equals method");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		if (!(this instanceof Object)) {
			return false;
		}
		AmericanTourister american = (AmericanTourister) obj;
		return this.number == (american.number) && this.modal.equals(american.modal)
				&& this.numberOfBrands == (american.numberOfBrands) && this.price == (american.price)
				&& this.tax == (american.tax) && this.gst == (american.gst) && this.serviceTax == (american.serviceTax)
				&& this.bagsSelledPerDay == (american.bagsSelledPerDay) && this.brandName.equals(american.brandName)
				&& this.numberOfModals == (american.numberOfModals) && this.logo == (american.logo)
				&& this.quality.equals(american.quality) && this.ambassidor == (american.ambassidor)
				&& this.inStock == (american.inStock) && this.contactInfo == (american.contactInfo);
	}

	@Override
	public String toString() {
		return "[number=" + this.number + ", modal=" + this.modal + ", numberOfBrands=" + this.numberOfBrands
				+ ", price=" + price + ", tax=" + tax + ", gst=" + gst + ", serviceTax=" + serviceTax
				+ ", bagsSelledPerDay=" + bagsSelledPerDay + ", brandName=" + brandName + ", numberOfModals="
				+ numberOfModals + ", logo=" + logo + ", quality=" + quality + ", ambassidor=" + ambassidor
				+ ", inStock=" + inStock + ", contactInfo=" + contactInfo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int results = 1;
		results = results * prime + number;
		results = results * prime + modal.hashCode();
		results = results * prime + numberOfBrands;
		results = results * prime + price;
		results = results * prime + tax;
		results = results * prime + gst;
		results = results * prime + serviceTax;
		results = results * prime + bagsSelledPerDay;
		results = results * prime + brandName.hashCode();
		results = results * prime + numberOfModals;
		results = results * prime + logo;
		results = results * prime + quality.hashCode();
		results = results * prime + ambassidor.hashCode();
		results = results * prime + inStock;
		results = results * prime + contactInfo;

		return results;

	}
}
