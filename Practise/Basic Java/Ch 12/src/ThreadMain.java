class ThreadA extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;++i)
			System.out.println("I am Thread A "+i);
		System.out.println("Thread A Exit");
	}
}
class ThreadB extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;++i)
			System.out.println("I am Thread B "+i);
		System.out.println("Thread B Exit");
	}
}
class ThreadC extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;++i)
			System.out.println("I am Thread C "+i);
		System.out.println("Thread C Exit");
	}
}
public class ThreadMain {
	public static void main(String args[])
	{
		new ThreadA().start();
		new ThreadB().start();
		new ThreadC().start();
		System.out.println("Exit Main");
	}
}
