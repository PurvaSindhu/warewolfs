package com.xworkz.myntra.dto;

public class MyntraCostumerDetailsDto {

	public int numberOfOrders;
	public int shirtsOrdered;
	public int ordersPerDay;
	public String loginID;
	public String email;
	public long phoneNumber;
	public int shoesOrdered;
	public int otp;
	public String cosmatics;
	public String discounts;

	public MyntraCostumerDetailsDto() {
		System.out.println("constructor");
	}

	public MyntraCostumerDetailsDto(int numberOfOrders, int shirtsOrdered, int ordersPerDay, String loginID, String email,
			long phoneNumber,int shoesOrdered,int otp,String cosmatics,String discounts) {
		super();
		this.numberOfOrders = numberOfOrders;
		this.shirtsOrdered = shirtsOrdered;
		this.ordersPerDay = ordersPerDay;
		this.loginID = loginID;
		this.email = email;
		this.phoneNumber=phoneNumber;
		this.shoesOrdered=shoesOrdered;
		this.otp=otp;
		this.cosmatics=cosmatics;
		this.discounts=discounts;

	}

	public int getNumberOfOrders() {
		System.out.println("the number of orders=" + numberOfOrders);
		return numberOfOrders;
	}

	public void setNumberOfOrders(int numberOfOrders) {
		this.numberOfOrders = numberOfOrders;
	}

	public int getShirtsOrdered() {
		System.out.println("the number of shirts ordered=" + shirtsOrdered);
		return shirtsOrdered;
	}

	public void setShirtsOrdered(int shirtsOrdered) {
		this.shirtsOrdered = shirtsOrdered;
	}

	public int getOrdersPerDay() {
		System.out.println("ordersPerDay" + ordersPerDay);
		return ordersPerDay;
	}

	public void setOrdersPerDay(int ordersPerDay) {
		this.ordersPerDay = ordersPerDay;
	}

	public String getLoginID() {
		System.out.println("loginID" + loginID);
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getEmail() {
		System.out.println("email" + email);
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		System.out.println("phoneNumber" + phoneNumber);
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getShoesOrdered() {
		System.out.println("shoesOrdered" + shoesOrdered);
		return shoesOrdered;
	}

	public void setShoesOrdered(int shoesOrdered) {
		this.shoesOrdered = shoesOrdered;
	}

	public int getOtp() {
		System.out.println("otp" + otp);
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getCosmatics() {
		System.out.println("cosmatics" + cosmatics);
		return cosmatics;
	}

	public void setCosmatics(String cosmatics) {
		this.cosmatics = cosmatics;
	}

	public String getDiscounts() {
		System.out.println("discounts" + discounts);
		return discounts;
	}

	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}

	@Override
	public String toString() {
		return "MyntraCostumerDetailsDto [numberOfOrders=" + numberOfOrders + ", shirtsOrdered=" + shirtsOrdered
				+ ", ordersPerDay=" + ordersPerDay + ", loginID=" + loginID + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", shoesOrdered=" + shoesOrdered + ", otp=" + otp + ", cosmatics=" + cosmatics
				+ ", discounts=" + discounts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cosmatics == null) ? 0 : cosmatics.hashCode());
		result = prime * result + ((discounts == null) ? 0 : discounts.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((loginID == null) ? 0 : loginID.hashCode());
		result = prime * result + numberOfOrders;
		result = prime * result + ordersPerDay;
		result = prime * result + otp;
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + shirtsOrdered;
		result = prime * result + shoesOrdered;
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
		MyntraCostumerDetailsDto other = (MyntraCostumerDetailsDto) obj;
		if (cosmatics == null) {
			if (other.cosmatics != null)
				return false;
		} else if (!cosmatics.equals(other.cosmatics))
			return false;
		if (discounts == null) {
			if (other.discounts != null)
				return false;
		} else if (!discounts.equals(other.discounts))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (loginID == null) {
			if (other.loginID != null)
				return false;
		} else if (!loginID.equals(other.loginID))
			return false;
		if (numberOfOrders != other.numberOfOrders)
			return false;
		if (ordersPerDay != other.ordersPerDay)
			return false;
		if (otp != other.otp)
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (shirtsOrdered != other.shirtsOrdered)
			return false;
		if (shoesOrdered != other.shoesOrdered)
			return false;
		return true;
	}

}
