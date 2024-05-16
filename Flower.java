class Flower{
	
	public int numberOfFlowers;
	public String nameOfFlower;
	
	public Flower(){
		System.out.println("this is no args constorctor");
	}
	public Flower(int numberOfFlowers){
		System.out.println("the number of flowers are="+numberOfFlowers);
	}
	public Flower(int numberOfFlowers,String nameOfFlower){
		System.out.println("the number of flowers are="+numberOfFlowers+"nameOfFlower"+nameOfFlower);
	}

}