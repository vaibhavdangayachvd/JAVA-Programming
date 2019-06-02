
public class WhileString {
	public static void main(String []args)
	{
		StringBuffer str=new StringBuffer();
		char c;
		System.out.print("Enter a string : ");
		try {
			while((c=(char)System.in.read())!='\n')
				str.append(c);
		}
		catch(Exception e) {}
		System.out.println("String : "+str);
	}
}