package homework;

public class Begin24
/*
*Begin24. Test the validity of statements:"The point with coordinates (x, y) lies inside rectangle, the upper-left vertex
*which has the coordinates (x1, y1), right Everyday - (x2, y2), and the sides are parallel the coordinate axes. "
 */
{
	
	public static void main(String[] args)
	{
		
		int x = 2;
		int y = 2;
		int x1 = 5;
		int y1 = 5;
		int x2 = 8;
		int y2 = 8;
		
		if ((x > x1) && (x < x2) && (y < y1) && (y > y2))
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
