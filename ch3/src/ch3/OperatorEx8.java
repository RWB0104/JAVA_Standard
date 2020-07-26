package ch3;

public class OperatorEx8
{
	public static void main(String[] args)
	{
		// 1,000,000 1백만
		int a = 1_000_000;
		
		// 2,000,000 2백만
		int b = 2_000_000;
		
		// a * b = 2,000,000,000,000 ?
		long c = a * b;
		
		System.out.println(c);
	}
}