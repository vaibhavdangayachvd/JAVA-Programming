
public class Sync {
	public static void main(String args[])
	{
		S1 s1=new S1();
		S2 s2=new S2();
		s1.start();
		s2.start();
	}
}
class S1 extends Thread
{
	@Override
	public void run()
	{
		temp.test(0);
	}
}
class S2 extends Thread
{
	@Override
	public void run()
	{
		temp.test(1);
	}
}
class temp{
	static void test(int x)
	{
		synchronized(temp.class) {
		for(int i=0;i<10;++i)
			{
				System.out.println(x);
			}
		}
	}
}
