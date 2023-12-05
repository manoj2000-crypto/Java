package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	void demo() 
	{
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		
		queue1.add("Manoj");
		queue1.add("AAA");
		queue1.add("BBB");
		
		
		//To insert the specialized element 
		queue1.offer("ZZZ");
		
		//To retrives , but does not remove the head of queue
		System.out.println("Head : " + queue1.element());
		
		//To retrive, but does not remove , the head of queue.
		System.out.println("Head : " + queue1.peek());
		
		System.out.println("\nIeterating the eleemnts : ");
		
		Iterator<String> itr = queue1.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		//retrives and remove the head of the queue
		queue1.remove();
		
		//retrives and removes the head of the queue
		queue1.poll();
		System.out.println("\nAfter removing two elements : ");
		
		Iterator<String> itr2 = queue1.iterator();
		while(itr2.hasNext()) 
		{
			System.out.println(itr2.next());
		}
		
	}
	
	public static void main(String[] args) {
		
		PriorityQueueDemo pqd = new PriorityQueueDemo();
		
		pqd.demo();
		
	}

}
