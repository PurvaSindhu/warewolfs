package com.xworkz.shoes.dto;

import java.util.ArrayList;

public class ShoesDto {
	private String size;
	private String modal;
	private String brand;
	private String type;
	
	public ShoesDto(String size, String modal, String brand, String type) {
		super();
		this.size = size;
		this.modal = modal;
		this.brand = brand;
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Shoes [size=" + size + ", modal=" + modal + ", brand=" + brand + ", type=" + type + "]";
	}
	
}
