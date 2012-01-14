package homework;

public class Begin27
/*
 * Begin27. ѕроверить истинность высказывани€:
 * "—реди трех данных целых чисел есть хот€ бы одна пара совпадающих".
 */
{
	
	public static void main(String[] args)
	{
		
		int one = 1;
		int two = 2;
		int three = 3;
		if (one == two || two == three || one == three)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
