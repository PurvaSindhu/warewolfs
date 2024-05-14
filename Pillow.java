class Pillow{
	
	public Pillow(){
		System.out.println("this is no args constructor");
	}
	public void Pillow(int numberOfPilllow){
		System.out.println("the number of pillows are="+numberOfPilllow);
	}
	public void Pillow(int numberOfPilllow,char colourOfPillow){
		System.out.println("the colour of the pillow is="+"numberOfPilllow="+numberOfPilllow+"colourOfPillow="+colourOfPillow);
	}
	public void Pillow(int numberOfPilllow,char colourOfPillow,boolean isAvailable){
		System.out.println("the colour of the pillow is="+"numberOfPilllow="+numberOfPilllow+"colourOfPillow="+colourOfPillow+"=isAvailable"+isAvailable);
	}
	public void Pillow(int numberOfPilllow,char colourOfPillow,boolean isAvailable,float gstOfPillow){
		System.out.println("the colour of the pillow is="+"numberOfPilllow="+numberOfPilllow+"colourOfPillow="+colourOfPillow+"=isAvailable"+isAvailable+"=gstOfPillow"+gstOfPillow);
	}
}