package com.xworkz.textbook.boot;

import com.xworkz.textbook.childclass.Social;
import com.xworkz.textbook.things.TextBook;
import com.xworkz.textbook.childclass.EVS;

public class TextBookRunner {

	public static void main (String [] args){
		
		TextBook textbook = new Social();
		Social textbook2 = new EVS();
		
		textbook.number(50);
		textbook.subject("social");
		textbook2.number(70);
		textbook2.subject("EVS");
	}
}
