
public class Strings {
	public static void main(String args[])
	{
		String arr[]= {"Vaibhav","Harsh","Shivam","Anmol"};
		String temp=null;
		for(int i=0;i<arr.length-1;++i)
		{
			for(int j=0;j<arr.length-1-i;++j)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(String i:arr)
			System.out.println(i);
	}
}
