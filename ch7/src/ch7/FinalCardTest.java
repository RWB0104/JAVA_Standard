package ch7;

public class FinalCardTest
{
	public static void main(String[] args)
	{
		Card2 c = new Card2("HEART", 10);
		// c.NUMBER = 5;
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		
		// System.out.println(c.toString());
		System.out.println(c);
	}
}

class Card2
{
	// 상수지만 선언과 함께 초기화 하지 않고, 생성자에서 단 한번만 초기화할 수 있다.
	final int NUMBER;
	final String KIND;
	
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int num)
	{
		KIND = kind;
		NUMBER = num;
	}
	
	public Card2()
	{
		this("HEARD", 1);
	}
	
	public String toString()
	{
		return KIND + " " + NUMBER;
	}
}