
public class LabledJumps {
	public static void main(String[]args)
	{
		loop1:for(int i=0;i<10;++i)
		{
			loop2:for(int j=0;j<10;++j)
			{
				System.out.print(j+" ");
				if(j==4)
				{
					System.out.println();
					continue loop1;
				}
			}
		}
	}
}