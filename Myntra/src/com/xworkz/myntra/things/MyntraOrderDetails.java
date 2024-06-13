package com.xworkz.myntra.things;

import com.xworkz.myntra.dto.MyntraCostumerDetailsDto;

public class MyntraOrderDetails {

	public void info (int ordersRecived, int shirtsOrder, int ordersPerDay, String id, String gmail, long number,
			int orderedshoes,int otpNumber,String skinCare,String offers) {
		
		MyntraCostumerDetailsDto details = new MyntraCostumerDetailsDto();

		details.setNumberOfOrders(ordersRecived);
		details.setShirtsOrdered(shirtsOrder);
		details.setOrdersPerDay(ordersPerDay);
		details.setLoginID(id);
		details.setEmail(gmail);
		details.setPhoneNumber(number);
		details.setShoesOrdered(orderedshoes);
		details.setOtp(otpNumber);
		details.setCosmatics(skinCare);
		details.setDiscounts(offers);
		
		
		details.getNumberOfOrders();
		details.getShirtsOrdered();
		details.getOrdersPerDay();
		details.getLoginID();
		details.getEmail();
		details.getPhoneNumber();
		details.getShoesOrdered();
		details.getOtp();
		details.getCosmatics();
		details.getDiscounts();
		

	}

}
