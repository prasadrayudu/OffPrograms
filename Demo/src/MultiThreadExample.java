class Hi extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<9;i++)
			{
			System.out.println("Hi");
		     Thread.sleep(1000);
		 //   Thread.wait();
			}
		}
 	catch(Exception e)
		{
 			e.printStackTrace();
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<9;i++)
			{
			System.out.println("Hello");
			Thread.sleep(500);
			}
		}
 	catch(Exception e)
		{
 			e.printStackTrace();
		}
	}
}



public class MultiThreadExample {

	public static void main(String[] args) {
	
		Hi h=new Hi();
		h.start();	
		Hello h1=new Hello();
		h1.start();	
		
	}

}
