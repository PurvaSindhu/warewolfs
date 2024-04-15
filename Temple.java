class Temple{
	
	public static void main(String [] args){
		
		 String templeName="shree hanuman swamy temple";
		 boolean isTheTempleOpened=true;
		 
		 if(templeName=="shree hanuman swami temple" && isTheTempleOpened==true){
			 System.out.println("temple is opened");
		 }else{
			 System.out.println("temple not opened");			 
		 }
		 
		 if(templeName=="shree krishna temple" && isTheTempleOpened==true){
		 System.out.println("temple is opened");
		 }
		 
		 if(templeName=="shree vinayaka temple" && isTheTempleOpened==false){
			 System.out.println("temple not closed");
		 }
	}
}