class Cups{
	
	public static void main (String [] args){
		int numberOfCups=50;
		String colourOfTheCups="black";
		
		if (numberOfCups==50  || colourOfTheCups=="black"){
			System.out.println("the cups are flawless");
		}else {
			System.out.println("the cups are deffective");
		}
		if (numberOfCups!=50  || colourOfTheCups!="black"){
			System.out.println("the cups are flawless");
		}else {
			System.out.println("the cups are deffective");
		}
	}
}