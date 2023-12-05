package classAndObject;

public class AutoBoxingExample {

	public static void main(String[] args) {
		
		int a = 10;
		Integer obj = a; // Autoboxing
		Integer obj2 = Integer.valueOf(a); //prior java 5 version
		System.out.println(obj + " " + obj2);
		
		//unboxing
		Integer i = 20;
		int b = i;
		int c = i.intValue();
		System.out.println(b + " " + c);
		
		
				

	}

}
