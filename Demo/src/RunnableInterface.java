class Multithread implements Runnable
{
	public synchronized void run()
	{
		try 
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println();
			System.out.println("Thread details");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Multi implements Runnable
{
	public synchronized void run()
	{
		System.out.println("Thread Multi is joined");
	}
}

public class RunnableInterface {
	public static void main(String args[])
	{
		for(int i=0;i<9;i++)
		{
		Thread t=new Thread(new Multithread());
		t.start();
	//	t.notify();
	//	t.setName("Prasad");
	//	t.setPriority(Thread.MIN_PRIORITY);
	//	t.setDaemon(true);
		Thread t1=new Thread(new Multi());
		t1.start();
		try
		{
			t1.join();	
		//	t1.wait();
		}catch(Exception e)
		{
			e.printStackTrace();
			}
		
		
		
		
		
		
		}
	}
}
