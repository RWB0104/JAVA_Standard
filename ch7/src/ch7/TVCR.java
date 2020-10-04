package ch7;

public class TVCR extends Tv
{
	VCR vcr = new VCR();
	
	void play()
	{
		vcr.play();
	}
	
	void stop()
	{
		vcr.stop();
	}
	
	void rew()
	{
		vcr.rew();
	}
	
	void ff()
	{
		vcr.ff();
	}
}

class VCR
{
	// 전원상태(on/off)
	boolean power;
	
	int counter = 0;
	
	void power()
	{
		power = !power;
	}
	
	void play()
	{
		/* 내용 생략 */
	}
	
	void stop()
	{
		/* 내용 생략 */
	}
	
	void rew()
	{
		/* 내용 생략 */
	}
	
	void ff()
	{
		/* 내용 생략 */
	}
}