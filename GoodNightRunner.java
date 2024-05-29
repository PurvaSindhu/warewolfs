class GoodNightRunner{
	
	public static void main(String [] args){
		MosquitoRepelent repelent = new GoodNight();
		repelent.name();
		repelent.company();
		((MosquitoRepelent)repelent).effeciency();
        ((MosquitoRepelent)repelent).kills();
        
	}
}