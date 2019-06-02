
public class Inheritance {
	public static void main(String []args)
	{
		Derived obj=new Derived(3,4,5);
		System.out.println("Volume : "+obj.volume());
	}
}
class Base
{
	final private int l,b;
	final public  void fun()
	{
		System.out.println("I am Father !!");
	}
	public Base(int x,int y)
	{
		l=x;
		b=y;
	}
	final public int area()
	{
		return l*b;
	}
}
final class Derived extends Base
{
	final private int h;
	public Derived(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	final public int volume()
	{
		return area()*h;
	}
}