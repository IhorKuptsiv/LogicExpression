package homework;

public class Begin34
/*
 * Begin34. Test the validity of statements:"The figures of the three-digit number form an increasing or decreasing sequence "
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		
		if (one < two && two < three) || (one > two && two > three)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
