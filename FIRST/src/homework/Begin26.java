package homework;

public class Begin26
/*
 * Begin26. Проверить истинность высказывания:
 * "Данное целое число является нечетным трехзначным числом".
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
