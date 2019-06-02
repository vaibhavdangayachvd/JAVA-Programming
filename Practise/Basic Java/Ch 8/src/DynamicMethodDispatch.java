class Super
{
	public void display()
	{
		System.out.println("I am Super");
	}
}
class Sub extends Super
{
	public void display()
	{
		System.out.println("I am Sub");
	}
}
public class DynamicMethodDispatch {
	public static void main(String[]args)
	{
		Super obj=new Sub();
		obj.display();
	}
}