
public class Read {
	public static void main(String[]args)
	{
		try {
			System.out.print("Enter a Number : ");
			int c=System.in.read();
			System.out.println("Ascii : "+c);
			System.out.println("Value : "+(char)c);
		}
		catch(Exception e) {}
	}
}