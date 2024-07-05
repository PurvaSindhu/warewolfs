package school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SchoolRunner {
	
	public static void main(String[] args) {
		
		Comparator<Integer> key = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
						Integer int1 = Integer.valueOf(o1);
						Integer int2 = Integer.valueOf(o2);
						
				return int2.compareTo(int1);
			}
		};
		
		List<Integer> school = new ArrayList<Integer>();
		school.add(45);
		school.add(33);
		school.add(22);
		school.add(11);
		school.add(10);
		
		Collections.sort(school,key);
		for (Integer student : school) {
			System.out.println("school=="+student);
		}
		
	}

}
