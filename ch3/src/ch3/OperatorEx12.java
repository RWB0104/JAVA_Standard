package ch3;

public class OperatorEx12
{
	
	public static void main(String[] args)
	{
		// c1에는 문자 'a'의 코드값인 97이 저장된다.
		char c1 = 'a';
		
		// c1에 저장되어 있는 값이 c2에 저장된다.
		char c2 = c1;
		
		// c3를 공백으로 초기화 한다.
		char c3 = ' ';
		
		// 'a' + 1 -> 97 + 1 -> 98
		int i = c1 + 1;
		
		c3 = (char) (c1 + 1);
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}
	
}
