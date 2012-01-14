package homework;

public class Begin21
/*
 * Begin21. Проверить истинность высказывания:
 * "Квадратное уравнение A·x2 + B·x + C = 0 с данными коэффициентами A, B, C имеет вещественные корни"
 * .
 */
{
	
	public static void main(String[] args)
	{
		
		float a = 1;
		float b = 10;
		float c = 3;
		float d;
		
		d = (b * b) - (4 * a * c);
		
		if (d > 0)
		{
			double x1 = (-b + Math.sqrt(d)) / (2 * a);
			double x2 = (-b - Math.sqrt(d)) / (2 * a);
			
			if (x1 > 0 || x2 > 0)
			{
				System.out.println(true);
			}
			
		} else
		{
			
			System.out.println(false);
		}
		
	}
	
}
