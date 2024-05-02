class Button{
	public int numberOfButtons=12;
	
	public void setNumberOfButtons(int numberOfButtons){
		System.out.println("the number of buttons are="+numberOfButtons);
		this.numberOfButtons=numberOfButtons;
		if (numberOfButtons!=12){
			System.out.println("this is not the shirt i need");
		}else{
			System.out.println("i need to buy this");
		}
	}
	public int getNumberOfButtons(){
		System.out.println("this is the shirt with number of buttons="+numberOfButtons);
		return numberOfButtons;
	}

}