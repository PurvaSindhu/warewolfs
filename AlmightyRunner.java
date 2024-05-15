class AlmightyRunner{
	
	public static void main(String [] args){
		AlmightyVishnu vishnu=new AlmightyVishnu("krishna","chakra",true,"rukmini,radha");
		AlmightyVishnu vishnu2=new AlmightyVishnu("rama","archery",true,"seetha");
		Almighty flute=new Almighty();
		flute.devottee("maha bharath",1,"kamsa","kuchela",vishnu);
		Almighty bow=new Almighty();
		bow.devottee("ramayan",4,"ravan mahadev","Hanuman",vishnu2);
	}
}