class BottalRunner{
	
	public static void main(String[] args){
		System.out.println("this is a bottal class");
		Bottal bottal=new Bottal();
		bottal.setnumberOfBottals(100);
		bottal.getnumberOfBottals();
		Bottal bottal2=new Bottal();
		bottal2.setnameOfBottal("drinking water");
		bottal2.getnameOfBottal();
		bottal2.setisWaterAvailable(true);
		bottal2.getisWaterAvailable();
		System.out.println("this is the end of bottal");
		
	}
}