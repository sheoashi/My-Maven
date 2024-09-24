package accessmodifers1;

import accessModifiers.SampleAccessmodifers;
import accessModifiers.WithinClass;

public class Class3 {
	
	public void display2()
	{
		System.out.println("method outside the package");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class3 c3 = new Class3();
		c3.display2();
		SampleAccessmodifers c1= new SampleAccessmodifers();
		c1.display();
		WithinClass obj = new WithinClass();
		obj.print1();
		
		
	}

}
