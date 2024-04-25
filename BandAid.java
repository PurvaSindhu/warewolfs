class BandAid{
	static String injuryType;
	static int numberOfBandaids;
	static boolean available;
	
	public static void setInjuryFound(String firstAid){
		System.out.println("the bandaid is used as="+firstAid);
		injuryType=firstAid; 
	}
	public static void setBandaidsAvailable(int availability){
		System.out.println("the number of bandaids i have="+availability);
		numberOfBandaids=availability;
	}
	public static void setInjurysInfected(boolean infected){
		System.out.println("the injury on the body is infected");
		available=infected;
	}
	
	public static String getInjuryFound(){
		System.out.println("the band aid is used for="+injuryType);
		return injuryType;
	}
	public static int getBandaidsAvailable(){
		System.out.println("currently i have only these="+numberOfBandaids);
		return numberOfBandaids;
	}
	public static boolean getInjurysInfected(){
		System.out.println("are the injuries infected="+available);
		return available;
	}
}