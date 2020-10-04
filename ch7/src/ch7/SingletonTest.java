package ch7;

public class SingletonTest
{
	public static void main(String[] args)
	{
		// Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		s.toString();
	}
}

final class Singleton
{
	private static Singleton s = new Singleton();
	
	private Singleton()
	{
		// No
	}
	
	public static Singleton getInstance()
	{
		if (s == null)
		{
			s = new Singleton();
		}
		
		return s;
	}
}