package homework;

public class Begin25
/*
 * Begin25. ѕроверить истинность высказывани€:
 * "ƒанное целое число €вл€етс€ четным двузначным числом".
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 12;
		
		if (i % 2 == 0 && i >= 10 && i <= 99)
		{
			
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
