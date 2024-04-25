class BandAidRunner{
	
	public static void main(String [] args){
		BandAid.setInjuryFound("leg fracture");
		BandAid.setBandaidsAvailable(50);
		BandAid.setInjurysInfected(false);
		String foundInjury=BandAid.getInjuryFound();
		int availableBandaids=BandAid.getBandaidsAvailable();
		boolean infectedInjury=BandAid.getInjurysInfected();
		System.out.println("the hospital treated the mans="+foundInjury);
		System.out.println("the number of bandaids used are="+availableBandaids);
		System.out.println("the injuries were not infected="+infectedInjury);
	}
}