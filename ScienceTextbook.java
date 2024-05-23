class ScienceTextbook extends science{
	int size;
	public void biology10th(int size){
		System.out.println("this is science class="+size);
	    this.size=size;
		System.out.println("this science book size="+size);
		super.size=this.size;
	}
}