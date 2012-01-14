package homework;

public class Begin29
/*
 * Begin29. Проверить истинность высказывания:
 * "Сумма цифр данного трехзначного числа является четным числом".
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		int sum = one + two + three;
		if (sum % 2 == 0)
		{
			System.out.println(true);
			
		} else
		{
			System.out.println(false);
		}
		
	}
	
}
