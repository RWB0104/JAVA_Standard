package ch7;

public class Tv
{
	// 전원상태(on/off)
	boolean power;
	
	// 채널
	int channel;
	
	void power()
	{
		power = !power;
	}
	
	void channelUp()
	{
		++channel;
	}
	
	void channelDown()
	{
		--channel;
	}
}