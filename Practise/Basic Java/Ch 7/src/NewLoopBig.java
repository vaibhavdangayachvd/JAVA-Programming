import java.util.*;
public class NewLoopBig {
	public static void main(String []args)
	{
		System.out.println("Using normal loop");
		String state[]= {"Raj","Pun","Del"};
		for(int i=0;i<state.length;++i)
			System.out.println(state[i]);
		System.out.println("Using Special Loop");
		for(String st:state)
			System.out.println(st);
		ArrayList<String> city=new ArrayList();
		city.add("Jaipur");
		city.add("Mumbai");
		city.add("Ajmer");
		System.out.println("Using Array List Normal Loop");
		for(int i=0;i<city.size();++i)
			System.out.println(city.get(i));
		System.out.println("Using Array List Special Loop");
		for(String o:city)
			System.out.println(o);
		System.out.println("Using Array List Iterator");
		Iterator<String> itr=city.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		display(city);		
	}
	public static<T>void display (Collection<T> a)
	{
		System.out.println("Using Array List Special Loop with Function");
		for(T aa:a)
			System.out.println(aa);
		System.out.println();
		System.out.println("Using Array List Iterator with Function");
		Iterator<T> itr= a.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();
	}
}
