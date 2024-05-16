class Apple{

	public Apple(){
		System.out.println("this is no args constructor");
		this.perKG(4);
		this.appleName("kashmir apple");
	}

	public void perKG(int Apple){
		System.out.println("total number of apples are="+Apple);
	}

	public void appleName(String name){
		this.perKG(6);
		System.out.println("the varient name of apple is"+name);
	}

}
