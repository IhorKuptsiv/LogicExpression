package homework;

public class Begin33
/*
 * Begin33. ��������� ���������� ������������:
 * "����� ������� ������������ ����� �������� ������������ ������������������".
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		
		if (one < two && two < three)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
	
}
