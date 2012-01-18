package homework;

public class Begin26
/*
 * Begin26. Test the validity of statement: "This is an integer is an odd three-digit number. "
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 633;
		
		if (i % 2 == 1 && i >= 100 && i <= 999)
		{
			
			System.out.println(true);
			
		} else
		{
			System.out.println(false);
		}
		
	}
	
}
