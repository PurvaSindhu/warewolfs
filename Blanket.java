class Blanket{
	
	public static int numberOfBlankets;
	public static String fabric="cotton";
	public static char colourOfBlanket;
	
	public static void number(){
		numberOfBlankets=10;
		System.out.println("the number of blankets are="+numberOfBlankets);
	}
	public static void type(){
		System.out.println("the type of fabric is="+fabric);
	}
	public static void colour(char blanket){
		colourOfBlanket=blanket;
		System.out.println("the coloue of the blanket is="+colourOfBlanket);
	}
	
	public static void main(String []args){
		number();
		type();
		colour('b');
	}

}