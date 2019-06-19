
public class TryInterface {
	public static void main(String args[])
	{
		Person obj=new User();
		System.out.println("My name is "+obj.getName());
	}
}
interface Person
{
	int age=10;
	String name="Vaibhav";
	String getName();
	int getAge();
}
class User implements Person 
{
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}