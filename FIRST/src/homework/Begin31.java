package homework;

public class Begin31
/*
 * Begin31. Test the validity of statements:"This four-digit number is read equally from left to right and from right to left. "
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 1221;
		
		int oneTwo = (((i % 10) * 10) + ((i % 100) / 10));
		int threeFourth = i / 100;
		
		if (oneTwo == threeFourth)
		{
			
			System.out.println(true);
			
		} else
		{
			System.out.println(false);
		}
		
	}
	
}
