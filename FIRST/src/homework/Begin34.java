package homework;

public class Begin34
/*
 * Begin34. Проверить истинность высказывания:
 * "Цифры данного трехзначного числа образуют возрастающую или убывающую последовательность"
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		
		if (one < two && two < three || one > two && two > three)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
