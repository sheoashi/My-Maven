package accessmodifers1;

import accessModifiers.WithinClass;

public class Class4 extends WithinClass 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class4 obj =new Class4(); // calling outside package method thru inheritance.
		obj.print1();

	}

}
