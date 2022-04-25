package gitpullandpush;

public class A {
	
	
	public void m1()
	{
		System.out.println("This m1 method");
	}
	
//this pool added method
	public void m2()
	{
		System.out.println("This m2 method");
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("This is main method");
		A a=new A();
		a.m1();
		a.m2();
		a.m4();

	}
	
	public void m4()
	{
		System.out.println("This m2 method");
	}

}
