class WhatsApp{
	int numberOfTexts=10;
	String usesOfit="conneting with family";
	
	public WhatsApp(){
		System.out.println("this is a whatsapp class");
	}
	public void pings(int numberOfTexts){
		this.numberOfTexts=numberOfTexts;
		System.out.println("the number of messages that arent replyed="+this.numberOfTexts);
	}
	public void uses(String usesOfit){
		this.usesOfit=usesOfit;
		System.out.println("we can talk to our family and="+usesOfit);
	}
}