
public class Constructor {
	public static void main(String []args)
	{
		Rect obj1=new Rect(5);
		Rect obj2=new Rect(10,10);
		System.out.println("Area 1 : "+obj1.getArea());
		System.out.println("Area 2 : "+obj2.getArea());
		System.out.println("Count : "+Rect.getCount());
	}
}
class Rect
{
	private static int count;
	private int length,bredth;
	Rect(int a,int b)
	{
		count++;
		length=a;
		bredth=b;
	}
	Rect(int x)
	{
		count++;
		length=x;
		bredth=x;
	}
	Rect()
	{
		count++;
		length=1;
		bredth=1;
	}
	int getArea()
	{
		return length*bredth;
	}
	static int getCount()
	{
		return count;
	}
}