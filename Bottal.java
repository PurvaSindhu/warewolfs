class Bottal{
	public int numberOfBottals;
	public String nameOfBottal;
	public boolean isWaterAvailable;
	
	public void setnumberOfBottals(int number){
		System.out.println("the number of bootals is="+number);
		numberOfBottals=number;
	}
	public int getnumberOfBottals(){
		System.out.println("the number of bottals present are="+numberOfBottals);
		return numberOfBottals;
	}
	public void setnameOfBottal(String name){
		System.out.println("the name of the water bottal is="+name);
		nameOfBottal=name;
	}
	public String getnameOfBottal(){
		System.out.println("the name is="+nameOfBottal);
		return nameOfBottal;
	}
	public void setisWaterAvailable(boolean available){
		System.out.println("i have a bottal="+available);
		isWaterAvailable=available;
	}
	public boolean getisWaterAvailable(){
		System.out.println("we have a bottal"+isWaterAvailable);
		return isWaterAvailable;
	}
}