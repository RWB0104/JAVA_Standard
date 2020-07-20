package ch2;

public class CharToCode
{
	public static void main(String[] args)
	{
		// char ch = 65;
		char ch = 'A';
		
		// ch에 저장된 값을 int 타입으로 변환하여 저장한다.
		int code = (int) ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		// char hch = 0xAC00;
		char hch = '가';
		
		System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);
	}
}