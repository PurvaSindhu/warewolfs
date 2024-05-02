class Rice{
	public static  int numberOfBags=130;
	public static String nameOfRice="Indian gate";
	public static String typeOfRice="basumathi";
	
	public static int noOfBags(){
		if (numberOfBags==130){
			System.out.println("we have pleanty of rice bags");
		}else {
			System.out.println("we have less number of rice bags");
		}return numberOfBags;
	}
		
    public static String name(){
		if (nameOfRice=="Indian gate"){
			System.out.println("this is the rice bag i need");
		}else {
			System.out.println("not the one i need");
			
		}return nameOfRice;
	}
		
	public static String type(){
		if (typeOfRice=="sona masuri"){
			System.out.println("we eat this type of rice="+typeOfRice);
		}else {
			System.out.println("this not the type i need"+typeOfRice);

		}return typeOfRice;
	}
	}


