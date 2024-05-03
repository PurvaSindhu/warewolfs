class Home{
	public int numberOfHouses=20;
	public String houseAdress="NAS";
	public int doorNumber=150;
	
	public void houseDetails(int numberOfHouses){
		System.out.println("the number of house is="+this.numberOfHouses);
		this.numberOfHouses=numberOfHouses;
		System.out.println("the number of this="+numberOfHouses);
	}
	public void houseDetails(int numberOfHouses,String houseAdress){
		System.out.println("the hpuse is located in="+this.houseAdress);
		this.houseAdress=houseAdress;
	    System.out.println("the hpuse is located in="+houseAdress);

	}
	public void houseDetails(int numberOfHouses,String houseAdress,int doorNumber){
		System.out.println("the door number of the house is="+this.doorNumber);
		this.doorNumber=doorNumber;
		System.out.println("the door number of the house is="+this.doorNumber);
	}
}