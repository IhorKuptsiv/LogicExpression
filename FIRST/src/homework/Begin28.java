package homework;

public class Begin28
/*
 * Begin28. Test the validity of remarks: "Among these three integers numbers is at least one pair of mutually the opposite. "
 */
{
	
	public static void main(String[] args)
	{
		
		int one = 1;
		int two = -2;
		int three = -1;
		
		if (one == -two || two == -three || three == -one)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
