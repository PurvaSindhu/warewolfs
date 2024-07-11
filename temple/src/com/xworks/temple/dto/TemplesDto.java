package com.xworks.temple.dto;

public class TemplesDto {
	
	private String templeName;
	private int ticket;
	private int onlineTicket;
	private String location;
	
	
	public TemplesDto(String templeName, int ticket, int onlineTicket, String location) {
		super();
		this.templeName = templeName;
		this.ticket = ticket;
		this.onlineTicket = onlineTicket;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "TemplesDto [templeName=" + templeName + ", ticket=" + ticket + ", onlineTicket=" + onlineTicket
				+ ", location=" + location + "]";
	}
	
	
	public String getTempleName() {
		return templeName;
	}

	public void setTempleName(String templeName) {
		this.templeName = templeName;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public int getOnlineTicket() {
		return onlineTicket;
	}

	public void setOnlineTicket(int onlineTicket) {
		this.onlineTicket = onlineTicket;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + onlineTicket;
		result = prime * result + ((templeName == null) ? 0 : templeName.hashCode());
		result = prime * result + ticket;
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
		TemplesDto other = (TemplesDto) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (onlineTicket != other.onlineTicket)
			return false;
		if (templeName == null) {
			if (other.templeName != null)
				return false;
		} else if (!templeName.equals(other.templeName))
			return false;
		if (ticket != other.ticket)
			return false;
		return true;
	}
	
	

}
