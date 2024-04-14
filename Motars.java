class Motars{
	
	public static void main (String [] args){
		for (int number1=1;number1<=10;number1++){
			System.out.println("number of motars"+number1);
		}
		for (char colour='r';colour<='w';colour++){
			System.out.println("this is colour"+colour);
		}
		for (byte b=5;b<=10;b++){
			System.out.println("stores available"+b);
		}
		for (long a=12345678910l;a<=12345678920l;a++){
			System.out.println("contact number"+a);
		}
		for (short e=234;e<=241;e++){
			System.out.println("store mini"+e);
		}
		for (boolean d=true;d==false;d=!d){
			System.out.println("the given case is"+d);
		}
		for (float s=35.10f;s<=40.15f;s++){
			System.out.println("decimal number"+s);
		}
		for (double y=36.101d;y<=41.106d;y++){
			System.out.println("decimal number 2"+y);
		}
	}
}