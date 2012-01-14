package homework;

public class Begin23
/*
 * Begin23. Проверить истинность высказывания:
 * "Данные числа x, y являются координатами точки, лежащей в первой или третьей координатной четверти"
 */
{
	
	public static void main(String[] args)
	{
		
		int x = 1;
		int y = 2;
		
		if (x > 0 && y > 0 || x > 0 && y < 0)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
