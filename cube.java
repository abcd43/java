import java.util.*;
class cube extends Thread
{
	Random r = new Random();
	public int n;
	public void run()
	{	
		try
		{
			for(int i=0; i<5; i++)
			{
				n = r.nextInt(10);
				System.out.println("Generated Random Number"+n);
				if(n%2==0)
				{
					thread squareThread = new thread(n);
					squareThread.start();
				}
				else
				{
					thread cubeThread = new thread(n);
					cubeThread.start();
				}
				sleep(1000);	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}