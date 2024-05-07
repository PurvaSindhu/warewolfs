class Wood{
	int numberOfTypes=10;
	String nameOfTheWood="green play";
	
	public Wood(){
		System.out.println("this is wood class no args constructor");
	}
	public void types(int numberOfTypes){
		this.numberOfTypes=numberOfTypes;
		System.out.println("there are many types of wood="this.numberOfTypes);
	}
	public void name(String nameOfTheWood){
		this.types(12);
		this.nameOfTheWood=nameOfTheWood;
		System.out.println("the name of the wood used is="this.nameOfTheWood);
	}
}