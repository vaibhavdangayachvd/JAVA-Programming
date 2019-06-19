
public class Sus_Res_Stop {
	public static void main(String args[])
	{
		MyImplementation a=new MyImplementation();
		try
		{
			Thread.sleep(3000);
			a.mySuspend();
			Thread.sleep(3000);
			a.myResume();
			Thread.sleep(3000);
			a.myStop();
		}
		catch(Exception e) {}
	}
}
class MyImplementation implements Runnable
{
	boolean suspendFlag,stopFlag;
	MyImplementation()
	{
		Thread th=new Thread(this);
		th.start();
	}
	@Override
	public void run()
	{
		try
		{
			int i=0;
			while(true)
			{
				synchronized(this) {
					if(suspendFlag)
						wait();
					if(stopFlag)
						return;
				}
				System.out.println("Value : "+i++);
			}
		}
		catch(InterruptedException e) {}
	}
	synchronized void mySuspend() {
		suspendFlag=true;
	}
	synchronized void myResume()
	{
		suspendFlag=false;
		notify();
	}
	synchronized void myStop()
	{
		stopFlag=true;
	}
}
