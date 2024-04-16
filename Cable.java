class Cable{
	
	public static void main (String [] args){
		
		int numberOfCables=10;
		String nameOfCable="finolex";
		
		if (numberOfCables==10 && nameOfCable!="finolex"){
			System.out.println("im gonna buy these cables");
		}else {
			System.out.println("im not gonna buy these");
		}
		
		if (numberOfCables!=10 && nameOfCable=="finolex"){
			System.out.println("this gonna buy these");
		}else{
			System.out.println("im not gonna buy these");
		}
	}
}