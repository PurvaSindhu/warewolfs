package com.xworkz.showroom.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.showroom.dto.ShowRoomDto;

public class ShowRoomRunner {
	
	public static void main(String[] args) {
		ShowRoomDto dto1 = new ShowRoomDto("cars", 20000, "modal2.0", 2);
		ShowRoomDto dto2 = new ShowRoomDto("cars", 20000, "modal2.0", 2);
		ShowRoomDto dto3 = new ShowRoomDto("cars", 20000, "modal2.0", 2);
		ShowRoomDto dto4 = new ShowRoomDto("cars", 20000, "modal2.0", 2);
		
		Set<ShowRoomDto> room = new HashSet<ShowRoomDto>();
		room.add(dto4);
		room.add(dto3);
		room.add(dto2);
		room.add(dto1);
		
		boolean boom = .equals(room);
		boom
		
		Iterator<ShowRoomDto> iterator = room.iterator();
		while (iterator.hasNext()) {
			System.out.println("result=="+iterator.next());
			
		}
		
		
		String car1="suv";
		String car2= "fortune";
		String car3 = "thar";
		String car4 = "range rover";
		
		Set <String> cars = new HashSet<String>();
		
		cars.add(car4);
		cars.add(car3);
		cars.add(car2);
		cars.add(car1);
		
	
		Iterator<String> ref1 = cars.iterator();
		while (ref1.hasNext()) {
			
			System.out.println("ref1=="+ref1.next());
			ref1.remove();
			System.out.println("ref1=="+ref1.next());
		}
		
		
	}

}
