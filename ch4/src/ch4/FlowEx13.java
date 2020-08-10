package ch4;

public class FlowEx13
{
	public static void main(String[] args)
	{
		// 합계를 저장하기 위한 변수.
		int sum = 0;
		
		for (int i = 1; i <= 10; i++)
		{
			// sum = sum + i;
			sum += i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
	}
}