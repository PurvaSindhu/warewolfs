class WardRobeRunner{
	
	public static void main(String [] args){
		System.out.println("this is a wardrobe class");
		WardRobe wardRobeDetail = new WardRobe();
		wardRobeDetail.wardrobeMethod();
		wardRobeDetail.sizeOfIt();
		wardRobeDetail.numberOfCubboards();
		System.out.println("the number of wardroads are="+wardRobeDetail.numberOfWardRobes);
		System.out.println("the colour of wardroads is="+wardRobeDetail.colour);
		System.out.println("the number of doors are="+wardRobeDetail.numberOfDoors);
		System.out.println("the contact number of wardroads are="+wardRobeDetail.contactInfo);
		System.out.println("the minime wardroads are="+wardRobeDetail.miniMe);
		System.out.println("the quality of wardroads is="+wardRobeDetail.quality);
		System.out.println("the price of wardroads are="+wardRobeDetail.price1);
		System.out.println("the price of second one  of wardroads is="+wardRobeDetail.price2);
		System.out.println("the name of the store is="+wardRobeDetail.nameOfCompany);
	}
}