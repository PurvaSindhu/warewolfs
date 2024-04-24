class MoleRunner{
	
	public static void main(String [] args){
		String [] soldiers=Mole.numberOfSoldiers();
		for(String values:soldiers){
			
			System.out.println("the name of the soldiers are="+values);
		}
		int [] molesPresent={402,222,108};
		int [] presentInArmy=Mole.noOfMoles(molesPresent);
		for (int soldierLife:presentInArmy){
			System.out.println("the number of moles are="+soldierLife);
		}
	}
}