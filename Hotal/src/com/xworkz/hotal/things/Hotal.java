package com.xworkz.hotal.things;

public class Hotal {

	public int numberOfDishes;
	public int idly;
	public String vada;
	public String sambar;
	public String tamatoRice;
	public String palav;
	public String dosa;
	public String chutney;
	public String service;
	public int price;
	public int gst;
	public int seviceTax;
	public int rating;
	public String location;
	public String hotalName;

	public Hotal() {
		System.out.println("this is hotal class");
	}

	public Hotal(int numberOfDishes, int idly, String vada, String sambar, String tamatoRice, String palav,
			String dosa) {
		this.numberOfDishes = numberOfDishes;
		this.idly = idly;
		this.vada = vada;
		this.sambar = sambar;
		this.tamatoRice = tamatoRice;
		this.palav = palav;
		this.dosa = dosa;

		System.out.println("this is hotal class" + "this.numberOfDishes=" + numberOfDishes + "this.idly=" + idly
				+ "this.vada=" + vada + "this.sambar=" + sambar + "this.tamatoRice=" + tamatoRice + "this.palav="
				+ palav + "this.dosa=" + dosa);
	}

	public Hotal(String chutney, String service, int price, int gst, int seviceTax, int rating, String location,
			String hotalName) {

		this.chutney = chutney;
		this.service = service;
		this.price = price;
		this.gst = gst;
		this.seviceTax = seviceTax;
		this.rating = rating;
		this.location = location;
		this.hotalName = hotalName;

		System.out.println("this.chutney=" + chutney + "this.service=" + service + "this.price=" + price + "this.gst="
				+ gst + "this.seviceTax=" + seviceTax + "this.rating=" + rating + "this.location=" + location
				+ "this.hotalName=" + hotalName);
	}

	public void setmasalaDosa(String masalaDosa) {
		this.dosa = masalaDosa;

	}

	public String getmasalaDosa() {
		System.out.println("the masala dosa is=" + dosa);
		return dosa;
	}

	public void setrating(int stars) {
		this.rating = stars;

	}

	public int getrating() {
		System.out.println("the masala dosa is=" + rating);
		return rating;
	}

	public void setprice(int cost) {
		this.price = cost;

	}

	public int getprice() {
		System.out.println("the masala dosa is=" + price);
		return price;
	}

	public void sethotalName(String name) {
		this.hotalName = name;

	}

	public String gethotalName() {
		System.out.println("the masala dosa is=" + hotalName);
		return hotalName;
	}

	public void setsambar(String type) {
		this.sambar = type;

	}

	public String getsambar() { 
		System.out.println("the sambar is="+sambar);
		return sambar;
	}

	@Override
	public String toString() {
		System.out.println("this is to string class");

		return "[numberOfDishes=" + this.numberOfDishes + ", idly=" + this.idly + ", vada=" + this.vada + ",sambar="
				+ sambar + ",tamatoRice=" + tamatoRice + ", palav=" + this.palav + ",dosa=" + this.dosa + ",chutney="
				+ this.chutney + ",service=" + this.service + ",price=" + this.price + ",gst=" + this.gst
				+ ", seviceTax=" + this.seviceTax + ", rating=" + this.rating + ", location=" + this.location
				+ ", hotalName=" + this.hotalName + "]";
	}

	@Override
	public boolean equals(Object obj) {
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
		Hotal hotal = (Hotal) obj;
		return this.numberOfDishes == (hotal.numberOfDishes) && this.idly == (hotal.idly)
				&& this.vada.equals(hotal.vada) && this.sambar.equals(hotal.sambar)
				&& this.tamatoRice.equals(hotal.tamatoRice) && this.palav.equals(hotal.palav)
				&& this.dosa.equals(hotal.dosa) && this.chutney.equals(hotal.chutney) && this.service.equals(hotal.service)
				&& this.price == (hotal.price) && this.gst == (hotal.gst) && this.seviceTax == (hotal.seviceTax)
				&& this.rating == (hotal.rating) && this.location.equals(hotal.location)&&this.hotalName.equals(hotal.hotalName);
	}
	
	@Override
	public int hashCode() {
		final int prime=2;
		int results=1;
		results= results*prime+numberOfDishes;
		results= results*prime+idly; 
		results= results*prime+vada.hashCode();
		results= results*prime+sambar.hashCode();
		results= results*prime+tamatoRice.hashCode();
		results= results*prime+palav.hashCode();
		results= results*prime+dosa.hashCode();
		results= results*prime+chutney.hashCode();
		results= results*prime+service.hashCode();
		results= results*prime+price;
		results= results*prime+gst;
		results= results*prime+seviceTax;
		results= results*prime+rating;
		results= results*prime+location.hashCode();
		results= results*prime+hotalName.hashCode();
		
		return results;
	}

}
