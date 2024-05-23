class GodSon extends GodFather{
	
	String name;
	
	public void godSon(String name){
		System.out.println("the name of godson is="+name);
	    this.name=name;
		System.out.println("the name of godson is="+name);
		super.name=this.name;
		System.out.println("the name of godson is="+name);
	}
}