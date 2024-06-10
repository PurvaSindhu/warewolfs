package com.xworkz.mosquitoRepelent.childclass;

import com.xworkz.mosquitoRepelent.things.MosquitoRepelent;

public class GoodNight extends MosquitoRepelent{

	@Override
	public void name() {
		System.out.println("the name of mosquito");
	}
	@Override
	public void kills() {
		System.out.println("it kills 99.9 %");
	}
	@Override
	public void behavior() {
		System.out.println("they suck blood in nature");
	}
	@Override
	public String breed() {
		System.out.println("they suck blood"+breeds);
		return breeds;
	}
	public String food() {
		System.out.println("they feed on blood");
		return foods;
	}

}
