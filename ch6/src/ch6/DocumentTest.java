package ch6;

public class DocumentTest
{
	public static void main(String[] args)
	{
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
		d1.toString();
		d2.toString();
		d3.toString();
		d4.toString();
	}
}

class Document
{
	static int count = 0;
	
	// 문서명(Document name)
	String name;
	
	// 문서 생성 시 문서명을 지정하지 않았을 때
	public Document()
	{
		this("제목 없음" + ++count);
	}
	
	public Document(String name)
	{
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}