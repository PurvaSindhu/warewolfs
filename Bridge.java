class Bridge{
	
	public static String bridgeName;
	public static int localBridgePresent=5;
	public static double bridgeLength;
	
	public static void name(){
		bridgeName="dibang bridge";
		System.out.println("the name of bridge is="+bridgeName);
	}
	public static void local(){
		System.out.println("the number of bridges present here are="+localBridgePresent);
	}
	public static void length(double distance){
		bridgeLength=distance;
		System.out.println("the length of the bridge is="+bridgeLength);
	}
	
	public static void main(String []args){
		name();
		local();
		length(6.200425673d);
	}
		
}