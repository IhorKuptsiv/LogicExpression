package homework;

public class Begin24
/*
 * Begin24. ��������� ���������� ������������: "����� � ������������ (x, y)
 * ����� ������ ��������������, ����� ������� ������� �������� ����� ����������
 * (x1, y1), ������ ������ � (x2, y2), � ������� ����������� ������������ ����".
 */
{
	
	public static void main(String[] args)
	{
		
		int x = 2;
		int y = 2;
		int x1 = 5;
		int y1 = 5;
		int x2 = 8;
		int y2 = 8;
		
		if ((x > x1) && (x < x2) && (y < y1) && (y > y2))
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
