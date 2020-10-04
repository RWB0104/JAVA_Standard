package ch7;

public class CastingTest2
{
	public static void main(String[] args)
	{
		Car car = new Car();
		Car car2 = new Car();
		
		FireEngine fe = null;
		
		car.drive();
		
		// 컴파일은 OK. 실행 시 에러가 발생
		fe = (FireEngine) car;
		fe.drive();
		
		car2 = fe;
		car2.drive();
	}
}