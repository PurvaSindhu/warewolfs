class BirdRunner{
	
	public static void main(String [] args){
		String [] bird=Bird.nameOfBird();
		for(String values:bird){
			
			System.out.println("the name of the bird is="+values);
		}
		int [] ageOfBirds={12,32,11};
		int [] lifeOfBird=Bird.birdAge(ageOfBirds);
		for (int birdLife:lifeOfBird){
			System.out.println("the age of a bird is="+birdLife);
		}
	}
}