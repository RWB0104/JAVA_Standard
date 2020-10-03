package ch6;

public class ConstructorTest
{
	public static void name(String[] args)
	{
		Data1 d1 = new Data1();
		d1.value++;
		
		// compile error 발생
		// Data2 d2 = new Data2();
	}
}

class Data1
{
	int value;
}

class Data2
{
	int value;
	
	Data2(int x)
	{
		value = x;
	}
}