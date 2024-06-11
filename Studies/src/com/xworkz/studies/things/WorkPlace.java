package com.xworkz.studies.things;

public abstract class WorkPlace {
	
	public WorkPlace() {
		System.out.println("this a no args cons");
	}
	public void location() {
		System.out.println("it is located in banglore");
	}
	public abstract void name();
	public abstract String distributionCenter();
	public abstract String established();
	public abstract boolean workPlaceEthics();
	public abstract double maximumPay();
	public abstract float minimumPay();
	public abstract long helpLineNumber();
	
}
