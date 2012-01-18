package homework;

public class Begin23
/*
*Begin23. Test the validity of statements:"These numbers x, y are the coordinates point lying in the first or third coordinate a *quarter. "
 */
{
	
	public static void main(String[] args)
	{
		
		int x = 1;
		int y = 2;
		
		if (x < 0 && y < 0 || x > 0 && y > 0)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
