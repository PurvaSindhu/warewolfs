package com.xworkz.wildAnimals.bridge;

import com.xworkz.wildAnimals.things.Bear;
import com.xworkz.wildAnimals.things.Fox;
import com.xworkz.wildAnimals.things.Lion;
import com.xworkz.wildAnimals.things.Tiger;
import com.xworkz.wildAnimals.things.Leopard;

public class CarnivorousAnimals extends Tiger implements Lion,Bear,Leopard,Fox{
	public void heavyPaws() {
		System.out.println("this is bear class");
	}
	public void extendedJaw() {
		System.out.println("this is bear jaws");
	}
	public void broadHead() {
		System.out.println("bear has boarrd head");
	}
	public void powerFullClaws() {
		System.out.println("power full claws");
	}
	public void shaggyCoats() {
		System.out.println("shaggy coats");
	}
	public void bushyTailed() {
		System.out.println("fox has bushy tailed");
	}
	public void narrowSnout() {
		System.out.println("narrow snort");
	}
	public void spottedFur() {
		System.out.println("spotted fur");
	}
	public void pointedEars() {
		System.out.println("pointed ears");
	}
	public void shortLeg() {
		System.out.println("short legs");
	}
	public void longBodied() {
		System.out.println("long bodied");
	}
	public void shortLegs() {
		System.out.println("tiger has short legs");
	}
	public void longTail() {
		System.out.println("long tailed");
	}
	public void broadHeads() {
		System.out.println("tiger has broad heads");
	}
	public void spotted() {
		System.out.println("spotted");
	}
	public void compactBody() {
		System.out.println("compact body");
	}
	public void foreLegs() {
		System.out.println("fore legs");
	}
	public void strongTeeth() {
		System.out.println(strong teeth);
	}
	public void kills() {
		System.out.println("they kill and eat");
	}
	public void strongJaws() {
		System.out.println("they have strong jaws");
	}
	public void carnivor() {
		System.out.println("they are carnivors");
	}

	public  void location() {
		System.out.println("they live in wild");
	}

	public  String name() {
		System.out.println("tiger");
		return null;
	}

	public  String agileBodied() {
		System.out.println("they has agile body");
		return null;
	}

	public  boolean solitaryHunter() {
		System.out.println("they has solitary hunter");
		return false;
	}

	public  double maximumPopulation() {
		System.out.println("maximum population is");
		return 0.00d;
	}

	public  float minimumPopulation() {
		System.out.println("minimum population is");
		return 0.0f;
	}

	public long helpLineNumber() {
		System.out.println("help line number is");
		return 0l;
	}


}
