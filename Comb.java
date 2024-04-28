class Comb{

	int numberOfCombes;
	byte storage;
	short qrCode;
	long customerNumber;
	char colourOfCombes;
	boolean isCombAvailable;
	float cost;
	double gst;
	String companyName;

	public void total(int totalCombes){
		System.out.println("number of combes==="+totalCombes);
		numberOfCombes=totalCombes;
	}

	public void combAvailability(boolean isAvailable){
		System.out.println("is the comb available==="+isAvailable);	
		isCombAvailable=isAvailable;
	}

	public void nameOfCompany(String name){
		System.out.println("name of the company is==="+name);
		companyName=name;
	}

}
	