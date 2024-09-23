package Inheritance;

public class SuperConstructorChild extends SuperConstructorParent
{
	public void print()
	{
		
		super.display();
		System.out.println(super.a);
		System.out.println("Super constructor child class");
	}
	public static void main(String[] args) 
	{
		
		SuperConstructorChild ss = new SuperConstructorChild();
		ss.print();
		
	}

}
