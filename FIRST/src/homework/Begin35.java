package homework;

public class Begin35
/*
 * Begin35. Проверить истинность высказывания:
 * "Цифры данного трехзначного числа образуют арифметическую прогрессию".
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
