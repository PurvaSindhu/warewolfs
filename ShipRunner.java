class ShipRunner{
	
	public static void main(String [] args){
		String [] ships=Ship.numberOfships();
		for(String values:ships){
			
			System.out.println("the name of the ships are="+values);
		}
		int [] shipsPresent={564,432,111};
		int [] presentships=Ship.numberOfDamages(shipsPresent);
		for (int sailersLife:presentships){
			System.out.println("the damaged ships are="+sailersLife);
		}
	}
}