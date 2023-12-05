package threadingExamples;

public class ThreadExample1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		
		System.out.println("Id : " + t1.getId());
		System.out.println("Name : " + t1.getName());
		System.out.println("Priority : " + t1.getPriority());
		System.out.println("Thread is Alive or not : " + t1.isAlive());
		t1.start();
		System.out.println("Thread State : " + t1.getState());
		t1.stop();
		System.out.println("Thread State : " + t1.getState());
		System.out.println("Thread Group : " + t1.getThreadGroup());
		
		System.out.println("======================");
		
		Thread t2 = new Thread();
		System.out.println("Id : " + t2.getId());
		System.out.println("Name : " + t2.getName());
		t2.setPriority(10);
		System.out.println("Priority : " + t2.getPriority());
		System.out.println("Thread is Alive or not : " + t2.isAlive());
		System.out.println("Thread State : " + t2.getState());
		System.out.println("Thread Group : " + t2.getThreadGroup());
		
		System.out.println("======================");
		
		if(t1.equals(t2))
		{
			System.out.println("Both threads are Same.");
		}
		else 
		{
			System.out.println("Both threads are not same.");
		}
	}

}
