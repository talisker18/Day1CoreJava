package oops;

import models.Employee;

public class ObjectOrientedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = //create reference variable
				
				new Employee(); //create new employee object and let emp variable point to it
		
		emp.displayDetails(); //we did not assign any values. any class extends the Object class
		//and if we dont specify any values for instance vars, the object class assigns default values
		//int -> 0
		//string -> null
		//float -> 0.0 etc
		
		System.out.println();
		
		/**emp.code=1;
		emp.name="Joel";
		emp.salary=12345.50F;*/
		
		emp.displayDetails();

	}

}
