class Principal extends Collage{
	int numberOfBranchs;
	
	public void branchName(int numberOfBranchs){
		this.numberOfBranchs=numberOfBranchs;
		System.out.println("the number of branches are="+numberOfBranchs);
		
		System.out.println("the number of branches are="+numberOfBranchs);
	    this.numberOfBranchs=numberOfBranchs;
		System.out.println("the number of branches are="+numberOfBranchs);
		super.numberOfBranchs=this.numberOfBranchs;
		System.out.println("the number of branches are="+numberOfBranchs);
    }
	
}