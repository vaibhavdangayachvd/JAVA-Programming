public class Runnablee {
	public static void main(String args[])
	{
		Mine x=new Mine();
		Thread th=new Thread(x);
		th.start();
		Thread a=new Thread() {
			@Override
			public void run()
			{
				for(int i=0;i<10;++i)
				{
					System.out.println("My name is Vaibhav");
				}
			}
		};
		a.start();
	}
}
class Mine implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<10;++i)
		{
			System.out.println("My name is Vaibhav");
		}
	}
}

