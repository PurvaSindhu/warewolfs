class FaceWashRunner{
	
	public static void main(String [] args){
		System.out.println("we have a facewash");
		FaceWash faceWash = new FaceWash();
		faceWash.NiveaMethod();
		faceWash.simpleMethod();
		faceWash.pilgrimMethod();
		System.out.println("its an exfoliation cream="+faceWash.numberOfFaceWash);
		System.out.println("the colour of the facewash is="+faceWash.colourOfIt);
		System.out.println("the QR code is="+faceWash.qrCode);
		System.out.println("contact info of the shop is="+faceWash.contactInfo);
		System.out.println("number of fash wash used="+faceWash.faceWashUsed);
		System.out.println("clear skin after used="+faceWash.clearFace);
		System.out.println("price of the fash wash="+faceWash.price1);
		System.out.println("the price os the second fash wash="+faceWash.price2);
		System.out.println("the name os the fash wsah is="+faceWash.nameOfTheFacewash);
	}
}