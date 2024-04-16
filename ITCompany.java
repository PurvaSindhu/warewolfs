class ITCompany{
	
	public static void main(String [] args){
		
		int[] numberOfCompanys={100,40,50,3,10,25,12,17,2,1};
		System.out.println("this is number of it companies"+numberOfCompanys[9]);
		for ( int i=0; i<numberOfCompanys.length; i++){
			System.out.println("the number of it companys are=="+numberOfCompanys[i]);
		}
		
		char [] colourOfTheCompany={'r','o','p','w','g','j','d','s','a','u'};
		System.out.println("this is signature colours of the company="+colourOfTheCompany[9]);
		for (char c=0;c<colourOfTheCompany.length; c++){
		System.out.println("signature colour of the company are=="+colourOfTheCompany[c]);
		}
		
		byte [] numberOfWorkers={10,20,39,40,50,60,70,80,90,100};
		System.out.println("cleaning staffof company are=="+numberOfWorkers[9]);
		for (byte s=0;s<numberOfWorkers.length;s++){
			System.out.println("cleaners of the office are="+numberOfWorkers[s]);
		}
		
		short [] employsWorking={200,100,300,500,400,39,70,10,5,15};
		System.out.println("working staff="+employsWorking[9]);
		for (short b=0;b<employsWorking.length;b++){
			System.out.println("working staff of each company=="+employsWorking[b]);
		}
		
		long [] contactNumber={12345678910l,12345678911l,12345678912l,12345678913l,12345678914l,12345678915l,12345678916l,12345678917l,12345678918l,12345678919l};
		System.out.println("contact Number of the company="+contactNumber[9]);
		for(int  e=0;e<contactNumber.length;e++){
			System.out.println("contact information="+contactNumber[e]);
		}
		
		float [] salaryPerDay={150.15f,160.15f,170.15f,180.15f,190.15f,200.15f,210.15f,220.15f,230.15f,240.15f};
		System.out.println("the salary of a person per day="+salaryPerDay[9]);
		for (int a=0;a<salaryPerDay.length;a++){
			System.out.println("the salary of a person is=="+salaryPerDay[a]);
		}
		
		double [] salaryPerMonth={150.15134d,160.15324d,170.15267d,180.1513245d,190.1523456d,200.1637882d,210.15324561d,220.1512345d,230.1531452d,240.15425163d};
		System.out.println("the salary of a person per month="+salaryPerMonth[9]);
		for (int  x=0;x<salaryPerMonth.length;x++){
			System.out.println("the salary per month="+salaryPerMonth[x]);
		}
	}
}