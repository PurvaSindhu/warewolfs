class TunnelRunner{
	
	public static void main(String [] args){
		Road road=new Road("moka road",5,"ballari");
		Road road2=new Road("sangankal road",3,"sangankal");
		Tunnel details =new Tunnel();
		details.Information(2,"net tunnel",130.234672d,road);
		Tunnel details2 =new Tunnel();
		details2.Information(1,"bagur navile tunnel",199.99999999d,road2);
	}
}