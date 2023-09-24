package StringExample;

public class String1 {

	public static void main(String[] args) {
		
		String str = "Manoj"; //String literal example.
		System.out.println(str);
		
		String str1 = new String("Hello"); // string creation using new keyword.
		System.out.println(str1);
		
		String s1="Welcome", s2="Hello ", s3="welcome", s4="     Welcome to Edubridge    ";
		
		System.out.println(" charAt(3) : " + s1.charAt(3)); // output : 'c'
		
		System.out.println(" Length : " + s2.length());
		
		System.out.println(" substring(3) : " + s1.substring(3));
		//                   substring(inclusive, exclusive);
		System.out.println(" substring(2,5) : " + s1.substring(2,5));
		
		System.out.println(" contains('e') : " + s1.contains("e"));
		
		System.out.println(" contains('x') : " + s1.contains("x"));
		
		System.out.println(" s1.equals(s3) : " + s1.equals(s3));
		
		System.out.println(" s1.equalsIgnoreCase(s3) : " + s1.equalsIgnoreCase(s3));

		System.out.println(" s2.isEmpty() : " + s2.isEmpty());
		
		System.out.println(" indexOf('e') : " + s1.indexOf("e")); // from first it will check
		
		//if want to check from last index 
		
		System.out.println(" lastIndexOf('e') : " + s1.lastIndexOf("e"));
		
		System.out.println(" concat() : " + s2.concat("User"));
		System.out.println(s2);
		
		System.out.println(" replace('e','a') : " + s3.replace('e','a'));
		
		System.out.println("upper case : " + s1.toUpperCase());
		System.out.println("lower case : " + s1.toLowerCase());
		
		System.out.println("length before trim() : " + s4.length());
		s4 = s4.trim();
		System.out.println("length after trim() : " + s4.length() );
		
		String splitedStrings[] = s4.split(" ");
		
		for(String string : splitedStrings) //splitedStrings[0] = "Welcome"
		{									//splitedStrings[1] = "to"
			System.out.println(string);		//splitedStrings[2] = "Edubridge"
		}
		System.out.println("count of words : " + splitedStrings.length);
	}

}
