
public class Const 
{
	int sum(final int a,final int b)
	{
		final int c=a+b;
		return c;
	}
	public static void main(String []args)
	{
		Const a=new Const();
		System.out.println(a.sum(1,2));
	}
}
