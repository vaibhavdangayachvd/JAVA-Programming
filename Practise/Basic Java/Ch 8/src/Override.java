
public class Override {
	public static void main(String []args)
	{
		Z obj=new Z();
		obj.display();
	}
}
class X
{
	void display()
	{
		System.out.println("I am Base");
	}
}
class Y extends X
{
	void display()
	{
		super.display();
		System.out.println("I am derived");
	}
}
class Z extends Y
{
	void display()
	{
		super.display();
		System.out.println("I am super derived");
	}
}
