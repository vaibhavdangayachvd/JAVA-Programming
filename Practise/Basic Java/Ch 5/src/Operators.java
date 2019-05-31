import java.io.DataInputStream;
import java.lang.Math;
import java.util.Scanner;
public class Operators {
	public static void main(String []args)
	{
		float a=0.0f;
		float b=0.0f;
		DataInputStream obj=new DataInputStream(System.in);
		Scanner obj1=new Scanner(System.in);
		try {
			System.out.print("Enter a number : ");
			a=Float.valueOf(obj.readLine()).floatValue();
			System.out.print("Enter another number : ");
			b=Float.valueOf(obj.readLine()).floatValue();
		}
		catch(Exception e) {}
		System.out.println("Sum : "+(a+b));
		System.out.println("Diff : "+(a-b));
		System.out.println("Mul : "+(a*b));
		System.out.println("Div : "+(a/b));
		System.out.println("Mod : "+(a%b));
		System.out.println(Math.sqrt(a));
	}
}
