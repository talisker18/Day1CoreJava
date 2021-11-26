package fundamentals;

import java.util.Scanner;

public class InputPrimitiveDatatypes {
	
	public static void main(String[] args) {
		
		/**int code = 1001;
		String name = "Joel Henz";
		long projectCode = 12345678;
		float salary = 12345.56F;*/
		
		Scanner scanner = new Scanner(System.in); //get inputstream of System class
		System.out.print("enter name: ");
		String name = scanner.nextLine();
		
		System.out.print("enter code: ");
		int code = scanner.nextInt();
		
		System.out.print("enter salary: ");
		float salary = scanner.nextFloat();
		
		System.out.println("employee name: "+name);
	
	}

}
