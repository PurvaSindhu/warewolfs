class Scooty{
	
	public String brand;
	public String modalName;
	public Details info;
	
	public void display(String brand,String modalName,Details info){
		System.out.println("the name of the client is="+info.name);
		System.out.println("the name of the client is="+info.phoneNumber);
		System.out.println("the name of the client is="+info.address);
		System.out.println("the name of the client is="+brand);
		System.out.println("the name of the client is="+modalName);
	}
}