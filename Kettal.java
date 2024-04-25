class Kettal{
	static int usesOfKettal;
    static boolean isKettalAvailable;
    static String nameOfTheKettal;
	
	public static void setKettalUses(int uses){
		System.out.println("it is used to boil water="+uses);
		usesOfKettal=uses;
	}
	public static void setAvailabilityOfKettel(boolean available){
		System.out.println("the kettal is available="+available);
		isKettalAvailable=available;
	}
	public static void setNameOfKettel(String kettalName){
		System.out.println("the name of the kettal is="+kettalName);
		nameOfTheKettal=kettalName;
	}
	public static int getKettalUses(){
		System.out.println("the uses of it is="+usesOfKettal);
		return usesOfKettal;
	}
	public static boolean getAvailabilityOfKettel(){
		System.out.println("is the kettal available="+isKettalAvailable);
		return isKettalAvailable;
	}
	public static String getNameOfKettel(){
		System.out.println("the name of the kettal is="+nameOfTheKettal);
		return nameOfTheKettal;
	}
}