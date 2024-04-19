class Truck{
	static int numberOfTrucks;
	static char colourOfTheTruck;
	static byte speedOfTruck;
	static long contactNumber;
	static short truckId;
	static float pricePrepaid;
	static double pricepaid;
	static String nameOfOwner;
	
	public static void noOfTrucks(int numberOfTrucks){
		System.out.println("the number of trucks are="+numberOfTrucks);
	}
	public static void colourOfTheTruck( char colourOfTheTruck){
		System.out.println("the colour of the truck is="+colourOfTheTruck);
	}
	public static void speedOfTruck(int speedOfTruck){
		System.out.println("the speed of the truck="+speedOfTruck);
	}
	public static void contactNumber(int contactNumber){
		System.out.println("the contact info="+contactNumber);
	}
    public static void  pricePrepaid(float pricePrepaid){
		System.out.println("the amount oaid is="+pricePrepaid);
	}
	public static void pricepaid(double pricepaid){
		System.out.println("the given="+pricepaid);
	}
	public static void nameOfOwner(String nameOfOwner){
		System.out.println("the owner name is="+nameOfOwner);
	}
	public static void truckId(int truckId ){
		System.out.println("the truck id is="+truckId);
	}
}