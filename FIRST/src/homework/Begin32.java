package homework;

public class Begin32
/*
 * Begin32. Test the validity of statements:"All the figures of the three-digit number are different. "
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		
		if (one == two || two == three || one == three)
		{
			System.out.println(false);
			
		} else
		{
			System.out.println(true);
		}
	}
	
}
