package ch2;

public class SpecialCharEx
{
	public static void main(String[] args)
	{
		// '''처럼 할 수 없다.
		System.out.println('\'');
		
		// \b에 의해 3이 지워진다.
		System.out.println("abc\t123\b456");
		
		// 개행(new line)문자 출력하고 개행
		System.out.println('\n');
		
		// 큰따옵표를 출력하려면 이렇게 한다.
		System.out.println("\"Hello\"");
		
		System.out.println("C:\\");
	}
}