class Geometry{
	
	public static void main (String [] args){
		
		int numberOfLessons=9;
		String nameOfTheBook="Ncert";
		
		if (numberOfLessons==9 && nameOfTheBook=="Ncert"){
			System.out.println("this is Ncert text book");
		}else {
			System.out.println("this is not a Ncert book");
		}
		if (numberOfLessons!=9 && nameOfTheBook!="Ncert"){
			System.out.println("this is Ncert text book");
		}else {
			System.out.println("this is not a Ncert book");
		}
	}
}