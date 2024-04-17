class Mountain{
	
	public static void main(String [] args){
	
	int numberOfMountains=10;
	String nameOfMountains="ballari fort";
	
	if (numberOfMountains!=10 && nameOfMountains=="ballarifort"){
	System.out.println("i in live near ballari fort");
	}else {
		System.out.println("ill not go to my home town");
	}
	
	if (numberOfMountains!=10 || nameOfMountains=="ballari fort"){
		System.out.println("i live near ballari fort");
	}else {
		System.out.println("ill not go to ballari");
	}
	
	for (int i=0;i<=10;i++){
		System.out.println("i love ballari"+i);
	}
	
	}
}