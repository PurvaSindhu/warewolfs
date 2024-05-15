class ShoeShowRoomRunner{
	
	public static void main(String [] args){
		Clients info=new Clients("bindhu",3214567890l,"vidhya nagar");
		Clients costomer2=new Clients("disha",543278601l,"bharthi nagar");
		ShoeShowRoom shoeShowRoom=new ShoeShowRoom();
		shoeShowRoom.details(7,"nike",'b',"sports shoes",info);
		ShoeShowRoom showRoom=new ShoeShowRoom();
		showRoom.details(6,"under armor",'w',"casual shoes",costomer2);
	}
}