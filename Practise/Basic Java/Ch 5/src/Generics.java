import java.util.*;
public class Generics {
	private static void Numberinglist(ArrayList<Integer> list)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter 2 Numbers : ");
		list.add(obj.nextInt());
		list.add(obj.nextInt());
	}
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Numberinglist(list);
		int total=0;
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext())
		{
			Integer val=iter.next();
			total+=(int)val;
		}
		System.out.println("Total : "+total);
	}
}