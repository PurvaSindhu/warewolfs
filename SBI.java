class SBI extends RBI{
	
	int numberOfBanks;
	
	public void name(int numberOBanks){
		this.numberOfBanks=numberOfBanks;
		System.out.println("this bank is accociated with="+numberOBanks);
		
		System.out.println("this bank is accociated with="+numberOBanks);
	    this.numberOfBanks=numberOfBanks;
		System.out.println("this bank is accociated with="+numberOBanks);
		super.numberOfBanks=this.numberOfBanks;
		System.out.println("this bank is accociated with="+numberOBanks);
    }
}