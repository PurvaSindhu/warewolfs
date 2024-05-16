class Tender{
	public static String owner;
	public static String tenderCoatedTo;
	public static int price=2;
	
	public static void ownedBy(String old){
		owner=old;
		System.out.println("was owned by="+owner);
	}
	public static void coatedTo(){
		tenderCoatedTo="house selling deed";
		System.out.println("the house goes to="+tenderCoatedTo);
	}
	public static void cost(){
		System.out.println("the price of tender is="+price);
	}
	
	public static void main(String [] args){
		ownedBy("ravi");
		coatedTo();
		cost();
	}
	
}