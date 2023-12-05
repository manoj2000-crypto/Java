package collections;

import java.util.LinkedList;

public class LinkedListIMplimentation {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("1MMM");
		linkedList.add("3AAA");
		linkedList.add("4NNN");
		linkedList.add("2OOO");
		linkedList.add("5JJJ");
		
		System.out.println(linkedList);
		
		linkedList.sort(null);
		System.out.println(linkedList);
	}

}
