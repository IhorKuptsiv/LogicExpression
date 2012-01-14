package homework;

public class Begin28
/*
 * Begin28. Проверить истинность высказывания:
 * "Среди трех данных целых чисел есть хотя бы одна пара взаимно противоположных"
 * .
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
