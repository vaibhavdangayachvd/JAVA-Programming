
public class Abstract {
	public static void main(String args[])
	{
		test obj=new hey();
		obj.fun();
	}
}
abstract class test
{
	abstract void fun();
}
class hey extends test
{
	void fun()
	{
		System.out.println("I m fun in hey");
	}
}
