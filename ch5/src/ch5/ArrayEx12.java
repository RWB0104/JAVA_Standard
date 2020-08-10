package ch5;

public class ArrayEx12
{
	public static void main(String[] args)
	{
		String[] names = { "Kim", "Park", "Yi" };
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.println("names[" + i + "]: " + names[i]);
		}
		
		// 배열 names의 세 번째 요소를 tmp에 저장
		String tmp = names[2];
		
		System.out.println("tmp: " + tmp);
		
		// 배열 names의 첫 번째 요소를 "Yu"로 변경
		names[0] = "Yu";
		
		// 향상된 for문
		for (String str : names)
		{
			System.out.println(str);
		}
	}
}