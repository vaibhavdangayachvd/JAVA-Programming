class MyException extends Throwable
{
	MyException(String message)
	{
		super(message);
	}
}
public class UdException {
	public static void main(String args[])
	{
		try
		{
			throw new MyException("It is try");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
