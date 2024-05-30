class Switch{
	
	public static void main(String [] args){
		
		int price=123;
		float gst= price;
		System.out.println("this is implict casting "+gst);
		
		double sgst=150.1234;
		int service= (int) sgst;
		System.out.println("this is explicite casting"+service);
		
		int name=67;
		char alpha= (char)name;
		System.out.println("this is explicite casting"+alpha);
	}
	
}