package homework;

public class Begin30
/*
 * Begin30. ��������� ���������� ������������:
 * "����� ���� ������ ���� ������� ��������������� ����� ����� ����� ���� ��� ��������� ����"
 * .
 */
{
	
	public static void main(String[] args)
	{
		
		int i = 1221;
		
		int SumOne = i / 1000 + (i / 100) % 10;
		int SumTwo = i % 10 + (i % 100) / 10;
		
		if (SumOne == SumTwo)
		{
			System.out.println(true);
			
		} else
		{
			System.out.println(false);
		}
		
	}
}
