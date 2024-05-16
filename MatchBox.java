class MatchBox{
	
	public static int numberOfSticks=60;
	public static String brandOfMatches;
	public static String size;
	public static boolean ifqualityOfMatchSticks;
	
	public static void total(){
		System.out.println("the total sticks present are="+numberOfSticks);
	}
	public static void brand(){
		brandOfMatches="sugana matchbox";
		System.out.println("the name of the box is="+brandOfMatches);
	}
	public static void sticks(String box){
		size=box;
		System.out.println("the size of the box is"+size);
	}
	public static void matchs(boolean ifavailable){
		ifqualityOfMatchSticks=ifavailable;
		System.out.println("the match box quality is good="+ifqualityOfMatchSticks);
	}
	
	public static void main(String []args){
		total();
		brand();
		sticks("medium");
		matchs(true);
	}
}