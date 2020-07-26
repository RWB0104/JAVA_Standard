package ch3;

public class OperatorEx14
{
	public static void main(String[] args)
	{
		char c = 'a';
		
		// 블럭{} 안의 문장을 26번 반복합낟.
		for (int i = 0; i < 26; i++)
		{
			// 'a'부터 26개의 문자를 출력한다.
			System.out.print(c++);
		}
		
		// 줄바꿈을 한다.
		System.out.println();
		
		c = 'A';
		
		// 블럭{} 안의 문장을 26번 반복합낟.
		for (int i = 0; i < 26; i++)
		{
			// 'A'부터 26개의 문자를 출력한다.
			System.out.print(c++);
		}
		
		System.out.println();
		
		c = '0';
		
		// 블럭{} 안의 문장을 10번 반복합낟.
		for (int i = 0; i < 10; i++)
		{
			// '0'부터 10개의 문자를 출력한다.
			System.out.print(c++);
		}
		
		System.out.println();
	}
}