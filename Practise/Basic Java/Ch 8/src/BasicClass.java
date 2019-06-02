
public class BasicClass {
	public static void main(String []args)
	{
		Rectangle obj;
		obj=new Rectangle();
		obj.getData(3, 4);
		System.out.println("Area : "+obj.getArea());
	}
}
class Rectangle
{
	private int length,bredth;
	void getData(int a,int b)
	{
		length=a;
		bredth=b;
	}
	int getArea()
	{
		return length*bredth;
	}
}