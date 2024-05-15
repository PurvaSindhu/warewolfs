class ShoeShowRoom{
	
	public int showSize;
	public String brand;
	public char colour;
	public String modal;
	public Clients clients;
	
	public void details(int showSize,String brand,char colour,String modal,Clients clients){
		System.out.println("the details of the client is="+clients.name);
		System.out.println("the details of the client is="+clients.phoneNumber);
		System.out.println("the details of the client is="+clients.address);
		System.out.println("the details of the client is="+showSize);
		System.out.println("the details of the client is="+brand);
		System.out.println("the details of the client is="+colour);
		System.out.println("the details of the client is="+modal);
	}
}