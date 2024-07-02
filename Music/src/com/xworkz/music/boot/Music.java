package com.xworkz.music.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Music {
	
	public static void main(String[] args) {
		String song="song1";
		String song2= "song2";
		String song3="song3";
		String song4="song4";
		String song5="song5";
		
		List<String> music = new LinkedList<String>();
		music.add(song);
		music.add(song5);
		music.add(song2);
		music.add(song3);
		music.add(song4);
		music.add(song5);
		music.add(song3);
		
		Iterator <String> ref1 = music.iterator(); 
		while (ref1.hasNext()) {
			System.out.println("the songs=="+ref1.next());
			
		}
		System.out.println("========================================");
		
		Set <String> music2 = new HashSet<String>();
		music2.add(song3);
		music2.add(song2);
		music2.add(song4);
		music2.add(song5);
		music2.add(song);
		
		Iterator <String> ref2 = music2.iterator(); 
		while (ref2.hasNext()) {
			System.out.println("the songs=="+ref2.next());
		}
	}

}
