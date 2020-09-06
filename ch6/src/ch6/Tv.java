package ch6;

public class Tv
{
	// Tv의 속성(멤버변수)
	
	// 색상
	String color;
	
	// 전원상태(on/off)
	boolean power;
	
	// 채널
	int channel;
	
	// Tv의 기능(메서드)
	
	// TV를 켜커나 끄는 기능을 하는 메서드
	void power()
	{
		power = !power;
	}
	
	// TV의 채널을 높이는 기능을 하는 메서드
	void channelUp()
	{
		++channel;
	}
	
	// TV의 채널을 낮추는 기능을 하는 메서드
	void channelDown()
	{
		--channel;
	}
}