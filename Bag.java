class Bag{
       
	public Bag(){
        this.number(20);
		this.name("wild craft");
		System.out.println("this is default constructor");
	}
	public void number(int numberOfBags){
		System.out.println("the number Of bags are="+numberOfBags);
	}
	public void name(String nameOfBag){
		this.number(31);
		System.out.println("the name of the bag is="+nameOfBag);
	}

}