class MelodyChocolate extends Parle{
	
     String type;
	public void brand(String type){
		super.type=type;
		System.out.println("this chocolate belongs to="+type);
	    this.type=type;
		System.out.println("this chocolate belongs to"+type);
		super.type=this.type;
		System.out.println("this chocolate belongs to="+type);
	}
}