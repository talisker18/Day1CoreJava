package fundamentals;

public class TypeCastinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 200;
		double num3= num1+num2; //implicite casting done by compiler
		
		int num4= (int) (100+num3); //explicite cast to int is needed because num3 is double
		
		System.out.println("number one: "+num1);
		System.out.println("number two: "+num2);
		System.out.println("number three: "+num3);
		
		
		byte b1 = 100;
		byte b2 = 120;
		byte b3 = (byte) (b1+b2);
		
		System.out.println(b3); //b3 = 220, but this is too big for byte -> data loss!
		//byte: Stores whole numbers from -128 to 127

	}

}
