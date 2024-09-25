package polymorphism;

public class ChildClass extends ParentClass
{
 //override
	
 	public void display()
 	{
 		System.out.println("child class");
 		super.display();
 	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj =new ChildClass();
		obj.display();
		//ParentClass ps =new ParentClass();
		//ps.display();
		
	}

}
