package Inheritance;

public class SuperChild extends SuperParent {
	public void print()
	{
		System.out.println("super child method");
		super.display();
		System.out.println(super.a);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SuperChild ob= new SuperChild();
			ob.print();

	}

}
