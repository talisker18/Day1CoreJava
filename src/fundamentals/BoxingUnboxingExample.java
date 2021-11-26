package fundamentals;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wrapper classes for each primitive type
		
		//boxing: convert primitive to reference type (to its wrapper class)
		//unboxing: from reference to primitive
		
		int a = 100;
		
		Integer intObj = Integer.valueOf(a); //boxing
		
		Integer intObj2 = Integer.valueOf(150);
		
		int b = intObj2.intValue(); //unboxing
		

	}

}
