class Gucci{
	
	public static void main(String [] args){
		int numberOfProducts=5;
		String handBags="original bags";
		
		switch(numberOfProducts){
			 case 1:handBags ="leather plain";
			 break;
			 
			 case 2:handBags="mormont";
			 break;
			 
			 case 3:handBags="mini bags";
			 break;
			 
			 case 4:handBags="backpacks";
			 break;
			 
			 case 5:handBags="original bags";
			 break;
			 
			 case 6:handBags="shoulder bags";
			 break;
			 
			 case 7:handBags=" gucci sling bag";
			 break;
			 
			 case 8:handBags="crossbody";
			 break;
			 
			 case 9:handBags="embroideredbags";
			 break;
			 
			 default:handBags="invalid";
			 
		}System.out.println("the bag i like is=="+handBags);
	}
}