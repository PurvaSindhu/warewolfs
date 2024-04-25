class Fruit{
	static int typesOfFruits;
	static boolean canEatFruits;
	static String summerFruit;
	
	public static void setNumberOfFruits(int number){
		System.out.println("the number of fruits are="+number);
		typesOfFruits=number;
	}
	public static void setEadibleFruits(boolean fruits){
		System.out.println("the friuts are"+fruits);
		canEatFruits=fruits;
	}
	public static void setFruitsInSummer(String inSummer){
		System.out.println("the summer fruits i like is="+inSummer);
		summerFruit=inSummer;
	}
	public static int getNumberOfFruits(){
		System.out.println("the number of fruits are"+typesOfFruits);
		return typesOfFruits;
	}
	public static boolean getEadibleFruits(){
		System.out.println("the fruits are="+canEatFruits);
		return canEatFruits;
	}
	public static String getFruitsInSummer(){
		System.out.println("the summer fruits i like is="+summerFruit);
		return summerFruit;
	}
}