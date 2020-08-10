package ch5;

public class ArrayEx5
{
	public static void main(String[] args)
	{
		// 총점을 저장하기 위한 변수
		int sum = 0;
		
		// 평균을 저장하기 위한 변수
		float average = 0f;
		
		int[] score = { 100, 88, 100, 100, 90 };
		
		for (int i = 0; i < score.length; i++)
		{
			sum += score[i];
		}
		
		// 계산결과를 float로 얻기 위해서 행변환
		average = sum / (float) score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}