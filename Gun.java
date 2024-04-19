class Gun{
	static String nameOfTheGun="firearms";
	static int numberOfGuns=32;
	
	public static void triggerGuard(){
		Tap.otherType();		
		System.out.println("the police have the gun="+nameOfTheGun);
	}
	
	public static void numberOfGuns(){
		System.out.println("the number of guns="+numberOfGuns);
	}
}