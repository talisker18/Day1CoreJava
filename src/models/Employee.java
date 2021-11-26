package models;

public class Employee {
	
	//data members
	private int code;
	private String name;
	private float salary;
	
	public Employee(){
		this.code = 1;
		this.name= "henz";
		this.salary=123456.50F;
	}
	
	//constructor overloading
	public Employee(int code, String name, float salary){
		this.code = code;
		this.name= name;
		this.salary=salary;
	}
	
	
	//member functions
	public void displayDetails() {
		System.out.println("employee details: ");
		System.out.println("code: "+this.code);
		System.out.println("name: "+this.name);
		System.out.println("salary: "+this.salary);
	}

}
