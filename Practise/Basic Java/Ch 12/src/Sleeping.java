
public class Sleeping {
	public static void main(String args[])
	{
		MyTry obj1=new MyTry();
		MyTry obj2=new MyTry();
		try
		{
			obj1.start();
			obj2.start();
		}
		catch(Exception e) {}
	}
}
class MyTry extends Thread
{
	static int count;
	int value;
	MyTry()
	{
		value=count++;
	}
	public void run()
	{
		for(int i=0;i<5000;++i)
			System.out.println("From thread "+ value+" : "+i);
	}
}