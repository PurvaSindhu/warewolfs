class Idly{
	
	public String typeOfIdly;
	public int idlyPerPlate;
	public boolean taste;
	public Sambar sambar;
	
	public void resto(String typeOfIdly,int idlyPerPlate,boolean taste,Sambar sambar){
		System.out.println("the item details picked are="+sambar.name);
		System.out.println("the item details picked are="+sambar.ingredients);
		System.out.println("the item details picked are="+sambar.hotal);
		System.out.println("the item details picked are="+typeOfIdly);
		System.out.println("the item details picked are="+idlyPerPlate);
		System.out.println("the item details picked are="+taste);
		
	}
}