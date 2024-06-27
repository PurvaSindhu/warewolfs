package com.xworkz.toothpaste.dto;

public class ToothPasteDto {
	
	private int numberOfPaste;
	private int price;
	private String name;
	private String flavor;
	
	
	public ToothPasteDto(int numberOfPaste, int price, String name, String flavor) {
		super();
		this.numberOfPaste = numberOfPaste;
		this.price = price;
		this.name = name;
		this.flavor = flavor;
	}


	public int getNumberOfPaste() {
		return numberOfPaste;
	}


	public void setNumberOfPaste(int numberOfPaste) {
		this.numberOfPaste = numberOfPaste;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFlavor() {
		return flavor;
	}


	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	@Override
	public String toString() {
		return "ToothPasteDto [numberOfPaste=" + numberOfPaste + ", price=" + price + ", name=" + name + ", flavor="
				+ flavor + "]";
	}
	
	

}
