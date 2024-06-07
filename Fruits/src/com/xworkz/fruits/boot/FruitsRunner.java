package com.xworkz.fruits.boot;

import com.xworkz.fruits.things.Fruits;

public class FruitsRunner {

	public static void main(String [] args) {
		
		Object obj = new Object();
		Fruits fruits = new Fruits();
		System.out.println("this is runner class");
		Fruits fruits1 = new Fruits("apple","banana","strawberry","mashMelon");
		Fruits fruits2 = new Fruits("waterMelon","promogranite","blueBerry","berries","calaBash");
		
		fruits.setBanana("banana milk shake");
		fruits1.setApple("apple juice");
		fruits2.setstrawberry("strawberry mikl shake");
		fruits.getBanana();
		fruits1.getApple();
		fruits2.getstrawberry();
		
		
		System.out.println("this is string to string class");
		System.out.println(fruits1.toString());
		System.out.println(fruits2.toString());
		System.out.println("this is instance class");
		System.out.println(fruits1 instanceof Fruits);
		System.out.println(fruits2 instanceof Fruits);
		System.out.println("this is equals to class");
		System.out.println(fruits1.equals(fruits1));
		System.out.println(fruits2.equals(fruits2));
		System.out.println("hash code");
		System.out.println(fruits1.hashCode());
		System.out.println(fruits2.hashCode());
		System.out.println(fruits1.equals(fruits));
		System.out.println(fruits2.equals(fruits));
	}

}
