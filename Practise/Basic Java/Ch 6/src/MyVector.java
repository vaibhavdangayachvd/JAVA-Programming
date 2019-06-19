import java.util.Vector;

import javax.print.DocFlavor.STRING;

public class MyVector {
	public static void main(String args[])
	{
		Vector<Vector<String>> vd = new Vector<Vector<String>>();
		Vector<String> hd=new Vector<String>();
		hd.add("vaibhav");
		vd.add(hd);
		System.out.println(vd.get(0).get(0));
	}
}
