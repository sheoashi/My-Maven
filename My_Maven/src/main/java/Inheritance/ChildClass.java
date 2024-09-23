package Inheritance;

public class ChildClass extends ParentClass  {
public void display()
{
	System.out.println("child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ChildClass sc =new ChildClass();
		sc.display();
		sc.print();
		System.out.println(sc.a);
		System.out.println(sc.b);

	}

}
