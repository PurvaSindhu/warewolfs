class LockRunner{
	
	public static void main(String [] args){
		String [] names=Lock.security();
		for(String  value:names){
			
			System.out.println("the passwords are="+value);
		}
		
		int [] pins={1506,1607,1097};
		int [] pinNumber=Lock.pinNumber(pins);
		for(int codes:pinNumber){
			System.out.println("the pinnumber is="+codes);
		}
	}
}