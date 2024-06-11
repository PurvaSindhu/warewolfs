package com.xworkz.studies.bridge;

import com.xworkz.studies.things.Collage;
import com.xworkz.studies.things.PreSchool;
import com.xworkz.studies.things.School;
import com.xworkz.studies.things.University;
import com.xworkz.studies.things.WorkPlace;

public class Student2 extends WorkPlace implements School, Collage, University, PreSchool {

	public void schoolName() {
		System.out.println("this is school class");
	}

	public void students() {
		System.out.println("the number os students are");
	}

	public void sports() {
		System.out.println("the students enjoy playing sports");
	}

	public void extraCirculum() {
		System.out.println("the love sports");
	}

	public void schoolFest() {
		System.out.println("the school fest is around the corner of the year");
	}

	public void collageName() {
		System.out.println("this is collage class");
	}

	public void located() {
		System.out.println("the collage located at");
	}

	public void number() {
		System.out.println("the number of students per year are");
	}

	public void labs() {
		System.out.println("they have lads");
	}

	public void chemLads() {
		System.out.println("the chemistry lads are good");
	}
	public void UniversityName() {
		System.out.println("this is uni method");
	}
	public void locatedAt() {
		System.out.println("this is located at");
	}

	public void numberOfStudents() {
		System.out.println("the number os students are");
	}

	public void numberOfTeachers() {
		System.out.println("the teachers are");
	}

	public void teachers() {
		System.out.println("they are good at teaching");
	}

	public void PreSchoolName() {
		System.out.println("this is preSchool class");
	}

	public void preSchoolLocation() {
		System.out.println("the location is");
	}

	public void kidsPresent() {
		System.out.println("the kids present are");
	}

	public void teacherPresent() {
		System.out.println("the teachers present are");
	}

	public void playGround() {
		System.out.println("play ground available");
	}

	public void location() {
		System.out.println("it is located in banglore");
	}

	public void name() {
		System.out.println("this student is placed in company x");
	}

	public String distributionCenter() {
		System.out.println("this is a distributed in");
		return null;
	}

	public String established() {
		System.out.println("the worl place was established in year");
		return null;
	}

	public boolean workPlaceEthics() {
		System.out.println("we have to follow work place ethics");
		return false;
	}

	public double maximumPay() {
		System.out.println("the maximum pay for a employ is");
		return 0.00d;
	}

	public float minimumPay() {
		System.out.println("the minimum pay of a employ is");
		return 0.0f;
	}

	public long helpLineNumber() {
		System.out.println("the help line number is");
		return 0l;
	}
	
}
