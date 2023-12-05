package threadingExamples;

class Resource
{
	//The resource creation (t)
	synchronized void SharedResource()
	{
		Thread t=Thread.currentThread();
		for(int i=0;i<=5;i++)
		{
			System.out.println(t.getName()+" : The resource thread :- "+i);
		}
	}
}

public class ThreadSync {
	public static void main(String[] args) {
		final Resource r=new Resource();
		//Thread 1 want to access the resource r
		Thread t1=new Thread("Thread---1")
				{
			@Override
					public void run()
					{
						System.out.println("Im a first");
						r.SharedResource();
					}
				};
			
		//Thread 2 want to access the resource r
		Thread t2=new Thread("Thread---2")
				{
					@Override
					public void run()
					{
						System.out.println("Im a second");
						r.SharedResource();
					}
				};
			t1.start();
			t2.start();
	}
}