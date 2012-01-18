package homework;

public class Begin33
/*
 * Begin33. Test the validity of statements:"The figures of the three-digit number form an increasing sequence. "
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		
		if (one < two && two < three)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
