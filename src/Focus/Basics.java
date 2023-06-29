package Focus;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		System.out.println("Java");
		System.out.println("Sql");
		System.out.println("Testng");
		System.out.println("TestNg inspired by junit");
		System.out.println("grid");
		Basics b = new Basics();
		b.Car();
		b.revString();
		b.revObject();

	}
	public void Car() {
		System.out.println("car petrol");
	}
	public void revString() {
		String asd = "abcde";
		StringBuffer sb = new StringBuffer();
		StringBuffer name =sb.reverse();
		System.out.println(name);
		System.out.println(asd);
		
	}
	public void revObject()
	{
		System.out.println("Selenium automation");
		int g = 45;
		int h = 67;
		int temp = 0;
				temp=g;
		g=h;
		
		 h= temp;
		 
		
		
		System.out.println(g);
		
		
		System.out.println(h);
	}

}
