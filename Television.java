class Television{
	public int invention=1929;
	public String nameOfTelevision="tcl";
	public double costOfTelevision=12345.86354d;
	
	public void setinvention(int invention){
		System.out.println("the television was invented="+invention);
		this.invention=invention;
	}
	public int getinvention(){
		System.out.println("it was invented in="+invention);
		return invention;
	}
	public void setnameOfTelevision(String nameOfTelevision){
		System.out.println("the name of tv is="+nameOfTelevision);
		this.nameOfTelevision=nameOfTelevision;
	}
	public String getnameOfTelevision(){
		System.out.println("the name of tv is="+nameOfTelevision);
		return nameOfTelevision;
	}
	public void setcostOfTelevision(double costOfTelevision){
		System.out.println("the cost of tv is="+costOfTelevision);
		this.costOfTelevision=costOfTelevision;
	}
	public double getcostOfTelevision(){
		System.out.println("the cost of tv is="+costOfTelevision);
		return costOfTelevision;
	}
	
}