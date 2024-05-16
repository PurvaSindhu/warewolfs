class TV{
	
	public static int numberOfChannels=100;
	public static String brandOfTV;
	public static String networkName;
	
	public static void channels(){
		System.out.println("the number of channels="+numberOfChannels);
	}
	public static void brand(){
		brandOfTV="samsung";
		System.out.println("the brand of the TV is="+brandOfTV);
	}
	public static void name(String network){
		networkName=network;
		System.out.println("the network company of the tv is="+networkName);
	}
	
	public static void main(String [] args){
		channels();
		brand();
		name("tata sky");
	}
} 