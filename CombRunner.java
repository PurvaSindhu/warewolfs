class CombRunner{

	public static void main(String []args){

		Comb hairComb=new Comb();

		hairComb.total(10);
		hairComb.combAvailability(true);
		hairComb.nameOfCompany("neem comb");
		hairComb.storage=67;
		hairComb.qrCode=2345;
		hairComb.customerNumber=4356278910l;
		hairComb.colourOfCombes='g';
		hairComb.cost=670.5786f;
		hairComb.gst=123.27899d;

		System.out.println("storage of comb per box==="+hairComb.storage);
		System.out.println("refrigerator code is==="+hairComb.qrCode);
		System.out.println("customer number is==="+hairComb.customerNumber);
		System.out.println("series of refrigerator is==="+hairComb.colourOfCombes);
		System.out.println("cost of the refrigerator is==="+hairComb.cost);
		System.out.println("gst of the refrigerator is==="+hairComb.gst);

	}
}