package homework;

public class Begin36
/*
 * Begin36. ��������� ���������� ������������:
 * "����� ������� ������������ ����� �������� �������������� ����������".
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 123;
		
		int one = i / 100;
		int two = (i / 10) % 10;
		int three = i % 10;
		
		if (one + one == two && two + two == three || three - two == two && two - one == one)
		{
			System.out.println(true);
		} else
		{
			System.out.println(false);
		}
	}
}
