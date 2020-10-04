package ch7;

public class CastingTest
{
	public static void main(String[] args)
	{
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		// car = (Car)fe;에서 형변환이 생략된 형태다.
		car = fe;
		// car.water();
		
		// 자손타입 <- 조상타입
		fe2 = (FireEngine) car;
		fe2.water();
	}
}

class Car
{
	String color;
	
	int door;
	
	// 운전하는 기능
	void drive()
	{
		System.out.println("drive, Brrrr~");
	}
	
	// 멈추는 기능
	void stop()
	{
		System.out.println("stop!!!");
	}
}

// 소방차
class FireEngine extends Car
{
	// 물을 뿌리는 기능
	void water()
	{
		System.out.println("water!!!");
	}
}