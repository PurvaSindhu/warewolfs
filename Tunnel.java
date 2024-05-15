class Tunnel{
	
	public int numberOfTunnels;
	public String name;
	public double length;
	public Road tunnel;
	
	public void Information(int numberOfTunnels,String name,double length,Road tunnel){
		System.out.println("the details of the road are="+tunnel.nameOfRoad);
		System.out.println("the details of the road are="+tunnel.numberOfInterSections);
		System.out.println("the details of the road are="+tunnel.location);
		System.out.println("the details of the road are="+numberOfTunnels);
		System.out.println("the details of the road are="+name);
		System.out.println("the details of the road are="+length);
	}
}