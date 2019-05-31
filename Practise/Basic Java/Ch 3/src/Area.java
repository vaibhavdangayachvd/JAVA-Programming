class area_data
{
	int length;
	int breadth;
	void get_data(int a,int b)
	{
		length=a;
		breadth=b;
	}
}
class Area {
	public static void main(String []args)
	{
		float area;
		area_data room1=new area_data();
		room1.get_data(2, 5);
		area=room1.length * room1.breadth;
		System.out.println("Area = : "+area);
	}
}