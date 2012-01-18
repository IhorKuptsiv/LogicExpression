package homework;

public class Begin30
/*
 * Begin30. Test the validity of statements:"The amount of the first two digits of the four-digit number is the sum of its two
 * the last digit. "
 * .
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 1221;
		
		int SumOne = i / 1000 + (i / 100) % 10;
		int SumTwo = i % 10 + (i % 100) / 10;
		
		if (SumOne == SumTwo)
		{
			System.out.println(true);
			
		} else
		{
			System.out.println(false);
		}
		
	}
}
