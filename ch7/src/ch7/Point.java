package ch7;

public class Point
{
	int x;
	int y;
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point()
	{
		this(0, 0);
	}
	
	String getXY()
	{
		// x와 y의 값을 문자열로 반환
		return "(" + x + ", " + y + ")";
	}
	
	String getLocation()
	{
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point
{
	int z;
	
	public Point3D()
	{
		// Point3D(int x, int y, int z)를 호출한다.
		this(100, 200, 300);
	}
	
	public Point3D(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
	}
	
	String getLocation()
	{
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}