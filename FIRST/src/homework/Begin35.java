package homework;

public class Begin35
/*
 * Begin35. Test the validity of statements:"The figures of the three-digit number form an arithmetic progression.
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		
		if (two - one == three - two)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
		
	}
}
