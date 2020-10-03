package ch6;

public class MemberCall
{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	
	// 에러. 클래스변수는 인스턴스 변수를 사용할 수 없음.
	// static int cv2 = iv;
	
	// 이처럼 객체를 생성한 후에야 인스턴스변수의 참조가능.
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1()
	{
		System.out.println(cv);
		
		// 에러. 클래스메서드에서 인스턴스변수를 사용불가.
		// System.out.println(iv);
		
		MemberCall c = new MemberCall();
		
		// 객체를 생성한 후에야 인스턴스변수의 참조가능.
		System.out.println(c.iv);
	}
	
	void instanceMethod1()
	{
		System.out.println(cv);
		
		// 인스턴스메서드에서는 인스턴스변수를 바로 사용가능.
		System.out.println(iv);
	}
	
	static void staticMethod2()
	{
		staticMethod1();
		
		// 에러. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
		// instanceMethod1();
		
		MemberCall c = new MemberCall();
		
		// 인스턴스를 생성한 후에야 호출할 수 있음.
		c.instanceMethod1();
	}
	
	// 인스턴스메서드에서는 인스턴스메서드와 클래스메서드
	void instanceMethod2()
	{
		// 인스턴스메서드에서는 인스턴스메서드와 클래스메서드 모두 인스턴스 생성없이 바로 호출이 가능하다.
		staticMethod1();
		instanceMethod1();
	}
}