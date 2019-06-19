
public class Specify {
	public static void lol()throws ArrayIndexOutOfBoundsException
	{
		int arr[]=new int[3];
	}
	public static void main(String args[])
	{
		try
		{
			lol();
		}
		catch(Exception e) {System.out.println(e.getMessage());}
	}
}
