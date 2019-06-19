public class StrBuffer {
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer();
		System.out.println(str.append("Vaibhav"));
		str.setCharAt(0,'B');
		System.out.println(str);
		str.setLength(10);
		System.out.println(str);
		str.insert(8, "Dangayach");
		System.out.println(str);
		str.setLength(str.length()-2);
		System.out.println(str);
		str.setLength(7);
		System.out.println(str);
		str.setLength(15);
		System.out.println(str);
	};
}
