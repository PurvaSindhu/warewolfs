class KettalRunner{
	 public static void main(String [] args){
		Kettal.setKettalUses(5);
		Kettal.setAvailabilityOfKettel(true);
		Kettal.setNameOfKettel("butterfly");
		int getTotalMethod= Kettal.getKettalUses();
		boolean getAvailablity=Kettal.getAvailabilityOfKettel();
		String getNameKettal=Kettal.getNameOfKettel();
		
		System.out.println("the number of uses are="+getTotalMethod);
		System.out.println("the kettal is available="+getAvailablity);
		System.out.println("the name of this is="+getNameKettal);
	 }
}