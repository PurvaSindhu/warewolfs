class IdlyRunner{
	
	public static void main(String [] args){
		Sambar sambar=new Sambar("rasam",5,"udapi adadithya");
		Sambar sambar2=new Sambar("soppu sambar",10,"hotal pola paradise");
		Idly idly=new Idly();
		idly.resto("ragi idly",3,true,sambar);
		Idly idly2=new Idly();
		idly2.resto("rava idly",3,true,sambar2);
	}
}