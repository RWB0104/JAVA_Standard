package ch7;

public class CaptionTvTest
{
	public static void main(String[] args)
	{
		CaptionTv ctv = new CaptionTv();
		
		// 조상 클래스로부터 상속받은 멤버
		ctv.channel = 10;
		
		// 조상 클래스로부터 상속받은 멤버
		ctv.channelUp();
		
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");
		
		// 캡션(자막) 기능을 켠다.
		ctv.caption = true;
		
		ctv.displayCaption("Hello, World");
	}
}

class CaptionTv extends Tv
{
	// 캡션상태(on/off)
	boolean caption;
	
	void displayCaption(String text)
	{
		// 캡션 상태가 on(true)일 때만 text를 보여준다.
		if (caption)
		{
			System.out.println(text);
		}
	}
}