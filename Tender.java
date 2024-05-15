class Tender{
	public static int price=2;
	public static String tenderCoatedTo;
	public static String owner="ravi";
	
	
	
	public static void main(String [] args){
		tenderCoatedTo="house selling deed";
		System.out.println("the house goes to="+tenderCoatedTo);
		System.out.println("the price of tender is="+price);
	}
	public static void ownedBy(String belong){
		owner=belong;
		System.out.println("was owned by="+owner);
	}
}