class FruitRunner{
public static void main(String [] args){
	Fruit.setNumberOfFruits(20);
	Fruit.setEadibleFruits(true);
	Fruit.setFruitsInSummer("mango");
	int getFruitsNo=Fruit.getNumberOfFruits();
	boolean getHealthy=Fruit.getEadibleFruits(); 
	String getLikedFruits=Fruit.getFruitsInSummer();
	
	System.out.println("the number of fruits are="+getFruitsNo);
	System.out.println("the fruits are="+getHealthy);
	System.out.println("the fruits i like are="+getLikedFruits);
    }
}