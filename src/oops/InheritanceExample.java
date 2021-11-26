package oops;

import java.util.Scanner;

abstract class Student{
	int id;
	String name;
	Scanner scan = new Scanner(System.in);
	
	public void acceptDetials() {
		System.out.print("enter id: ");
		this.id= scan.nextInt();
		scan.nextLine(); //we need this line because next input is String?
		
		System.out.print("enter name: ");
		this.name=scan.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("student id: "+this.id);
		System.out.println("student name: "+this.name);
	}
}

class Marks extends Student{
	float objectiveMarks;
	float subjectiveMarks;
	//Scanner scan = new Scanner(System.in); -> we do not need scanner again in child class
	
	
	public void acceptDetials() {
		super.acceptDetials(); //first create student
		System.out.print("enter objective marks: ");
		this.objectiveMarks= scan.nextFloat();
		//scan.nextLine(); //we need this line
		
		System.out.print("enter subjective marks: ");
		this.subjectiveMarks=scan.nextFloat();
	}
	
	public void displayDetails() {
		super.displayDetails(); 
		System.out.println("objective marks: "+this.objectiveMarks);
		System.out.println("subjective marks: "+this.subjectiveMarks);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Student stud1 = new Student();
		stud1.acceptDetials();
		stud1.displayDetails();*/
		Student stud1 = new Student();
		Marks m1 = new Marks();
		m1.acceptDetials();
		m1.displayDetails();
	}

}
