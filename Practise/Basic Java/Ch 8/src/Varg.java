
public class Varg {
	public static void main(String []args)
	{
		printNames("Vaibhav","Harsh","Shivam","Sohan");
	}
	public static void printNames(String...obj)
	{
		for(String o:obj)
			System.out.println("Welcome "+o);
	}
}