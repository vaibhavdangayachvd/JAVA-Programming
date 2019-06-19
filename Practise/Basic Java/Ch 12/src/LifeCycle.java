
public class LifeCycle extends Thread{
	public static void main(String[]args)
	{
		Thread a=new ThreadD();
		Thread b=new ThreadE();
		a.start();
		b.start();
	}
}
class ThreadD extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<1000;++i)
		{
			System.out.println(i + "Th D");
			suspend();
		}
	}
	
}
class ThreadE extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<1000;++i)
		{
			System.out.println(i + "Th E");
			suspend();
		}
	}
}
