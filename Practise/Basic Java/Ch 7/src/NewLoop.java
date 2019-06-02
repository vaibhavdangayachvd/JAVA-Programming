import java.util.*;
public class NewLoop {
	public static void main(String[]args)
	{
		Stack ma = new Stack();
		ma.push(1);
		ma.push(2);
		ma.push(3);
		for(Object o:ma)
			System.out.println(o);
	}
}
