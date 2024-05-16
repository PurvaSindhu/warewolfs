class Dosa{
	
	public int numberOfDosa=2;
	public String type;
	
	public Dosa(){
		System.out.println("no args cons");
	}
	
	public void total(int numberOfDosa){
		this.numberOfDosa=numberOfDosa;
		System.out.println("the number of dose="+numberOfDosa);
	}
	public void variety(String type){
		this.type=type;
		System.out.println("the type of dose="+type);
	}
	

}