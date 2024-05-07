class Kiwi{
	
	int numberOfkiwi=2;
	String ownerName="organic";
	
	public Kiwi(){
		System.out.println("This is no argument constructor");
	}
	
	public void total(int numberOfKiwi){
		this.numberOfkiwi=numberOfkiwi;
		System.out.println("the number of kiwi per box is="+ this.numberOfkiwi);
	}
	
	public void name(String ownerName){
		this.total(5);
		this.ownerName=ownerName;
		System.out.println("name of the owner is=="+this.ownerName);
	}
	
}