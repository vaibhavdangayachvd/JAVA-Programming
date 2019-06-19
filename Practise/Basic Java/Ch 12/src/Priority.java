
public class Priority {
	public static void main(String args[])
	{
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		threadA.setPriority(1);
		threadB.setPriority(9);
		threadC.setPriority(1);
		System.out.println("Thread A BEGIN");
		threadA.start();
		System.out.println("Thread B BEGIN");
		threadB.start();
		System.out.println("Thread C BEGIN");
		threadC.start();
		System.out.println("End of main");
	}
}
class A extends Thread
{
	@Override
	public void run() {
		System.out.println("Thread A Started");
		for(int i=0;i<100;++i)
			System.out.println(" From A - "+i);
		System.out.println("Thread A Finished");
	}
}
class B extends Thread
{
	@Override
	public void run() {
		System.out.println("Thread B Started");
		for(int i=0;i<100;++i)
			System.out.println(" From B - "+i);
		System.out.println("Thread B Finished");
	}
}
class C extends Thread
{
	@Override
	public void run() {
		System.out.println("Thread C Started");
		for(int i=0;i<100;++i)
			System.out.println(" From C - "+i);
		System.out.println("Thread C Finished");
	}
}
