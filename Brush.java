class Brush{
	static int brushCount;
	static char colour;
	static byte number;
	static long contactInfo;
	static short noOfBrushes;
	static float price1;
	static double price2;
	static String nameOfCompany;
	
	public static void brushEveryday(){
		System.out.println("we should brush our teeth everyday");
		Flute.music();
		Flute.krishna();
	}
	
	public static void brushCount(int brushCount){
		System.out.println("the brush count="+brushCount);
	}
	public static void colour(char colour){
		System.out.println("the colour of the brush="+colour);
	}
	public static void number(int number){
		System.out.println("the numberis equal to="+number);
	}
	public static void contactInfo(int contactInfo){
		System.out.println("the contact info is="+contactInfo);
	}
	public static void noOfBrushes(int noOfBrushes){
		System.out.println("there are many brushes="+noOfBrushes);
	}
	public static void price1(float price1){
		System.out.println("the price1 is ="+price1);
	}
	public static void price2(double price2){
		System.out.println("the price2 is="+price2);
	}
	public static void nameOfCompany(String nameOfCompany){
		System.out.println("the company name is="+nameOfCompany);
	}
}