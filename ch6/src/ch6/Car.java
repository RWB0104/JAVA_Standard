package ch6;

public class Car
{
	// 색상
	String color;
	
	// 변속기 종류 - auto(자동), manual(수동)
	String gearType;
	
	// 문의 개수
	int door;
	
	public Car()
	{
		this("white", "auto", 4);
	}
	
	// 인스턴스 복사를 위한 생성자
	public Car(Car c)
	{
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	public Car(String color)
	{
		this(color, "auto", 4);
	}
	
	public Car(String color, String gearType, int door)
	{
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}