class Plate{
	
	public static void main(String [] args){
		int numberOfPlates=8;
		String dishName="fried rice";
		
		switch(numberOfPlates){
			case 1:dishName="rice and sambar";
			break;
			
			case 2:dishName="curd rice";
			break;
			
			case 3:dishName="masala rice";
			break;
			
			case 4:dishName="ghee rice";
			break;
			
			case 5:dishName="palav";
			break;
			
			case 6:dishName="salad";
			break;
			
			case 7:dishName="dosa";
			break;
			
			case 8:dishName="fried rice";
			break;
			
			case 9:dishName="vadapav";
			break;
			
			case 10:dishName="burger";
			break;
			
			default:dishName="invalid";
						
		}System.out.println("the selected dish is==="+dishName);
	}
}