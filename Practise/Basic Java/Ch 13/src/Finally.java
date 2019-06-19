
public class Finally {
	public static void main(String[]args)
	{
		try
		{
			System.out.println(1/0);
		}
		catch(ArithmeticException e) {}
		finally
		{
			try
			{
				System.out.println(1);
			}
			catch(ArithmeticException e) {}
		}
	}
}
