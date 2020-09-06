package ch6;

public class ReferenceParamEx2
{
	public static void main(String[] args)
	{
		// 크기가 1인 배열. x[0] = 10
		int[] x = { 10 };
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
	}
	
	// 참조형 매개변수
	static void change(int[] x)
	{
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
}