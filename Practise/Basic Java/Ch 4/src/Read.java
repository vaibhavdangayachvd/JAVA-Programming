import java.io.DataInputStream;
public class Read {
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0;
		float b=0.0f;
		try
		{
			System.out.println("Enter integer value :- ");
			a=Integer.parseInt(in.readLine());
			System.out.println("Enter float value :- ");
			b=Float.valueOf(in.readLine()).floatValue();
		}
		catch(Exception e) {}
		System.out.println("Value Read Integer = "+a);
		System.out.println("Value Read Float  = "+b);
	}
}