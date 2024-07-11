package com.xworkz.train.dto;

public class TrainDto {
	
	private String name;
	private int arrival;
	private int duration;
	private String dropPoint;
	public TrainDto(String name, int arrival, int duration, String dropPoint) {
		super();
		this.name = name;
		this.arrival = arrival;
		this.duration = duration;
		this.dropPoint = dropPoint;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArrival() {
		return arrival;
	}
	public void setArrival(int arrival) {
		this.arrival = arrival;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDropPoint() {
		return dropPoint;
	}
	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + arrival;
		result = prime * result + ((dropPoint == null) ? 0 : dropPoint.hashCode());
		result = prime * result + duration;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		TrainDto other = (TrainDto) obj;
		if (arrival != other.arrival)
			return false;
		if (dropPoint == null) {
			if (other.dropPoint != null)
				return false;
		} else if (!dropPoint.equals(other.dropPoint))
			return false;
		if (duration != other.duration)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TrainDto [name=" + name + ", arrival=" + arrival + ", duration=" + duration + ", dropPoint=" + dropPoint
				+ "]";
	}
	
	

}
