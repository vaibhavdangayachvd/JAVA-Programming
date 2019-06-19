
public class Enums {
	enum Days{
		Monday,
		Tuesday,
		Wednesday,
		Thrusday,
		Friday,
		Saturday,
		Sunday
	}
	public static void main(String args[])
	{
		Days d1=Days.Monday;
		switch(d1)
		{
		case Monday:
			System.out.println("Seekh Gaya");
			break;
		}
	}
}
