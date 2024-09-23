package Abstraction;

public class SampleClass  extends AbstractClass {
	public void print()
	{
		System.out.println("abstract method");
	
	}
	public void show()
	{ 
		System.out.println("method in sample class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass ss= new SampleClass(); //sample class object create 
		ss.print();
		ss.show();
		ss.display();
		
	}

}
