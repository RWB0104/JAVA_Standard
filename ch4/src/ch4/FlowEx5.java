package ch4;

import java.util.Scanner;

public class FlowEx5
{
	public static void main(String[] args)
	{
		int score = 0;
		
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		// score가 90점 보다 같거나 크면 A학점(grade)
		if (score >= 90)
		{
			grade = 'A';
			
			// 90점 이상 중에서도 98점 이상은 A+
			if (score >= 98)
			{
				opt = '+';
			}
			
			// 90점 이상 94점 미만은 A-
			else if (score < 94)
			{
				opt = '-';
			}
		}
		
		// score가 80점 보다 같거나 크면 B학점(grade)
		else if (score >= 80)
		{
			grade = 'B';
			
			if (score >= 88)
			{
				opt = '+';
			}
			
			else if (score < 84)
			{
				opt = '-';
			}
		}
		
		// 나머지는 C학점(grade)
		else
		{
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}