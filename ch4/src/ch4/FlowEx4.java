package ch4;

import java.util.Scanner;

public class FlowEx4
{
	public static void main(String[] args)
	{
		// 점수를 저장하기 위한 변수
		int score = 0;
		
		// 학점을 저장하기 위한 변수. 공백으로 초기화한다.
		char grade = ' ';
		
		System.out.print("점수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		
		// 화면을 통해 입력받은 숫자를 score에 저장
		score = scanner.nextInt();
		
		scanner.close();
		
		// score가 90점 보다 같거나 크면 A학점
		if (score >= 90)
		{
			grade = 'A';
		}
		
		// score가 80점 보다 같거나 크면 B학점
		else if (score >= 80)
		{
			grade = 'B';
		}
		
		// score가 70점 보다 같거나 크면 C학점
		else if (score >= 70)
		{
			grade = 'C';
		}
		
		// 나머지는 D학점
		else
		{
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}