package accessModifiers;

// within the package and different class

public class SampleAccessmodifers {
	
	public void display()
	
	{
		System.out.println("method in class2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithinClass c1 = new WithinClass();
		c1.print1();
		//SampleAccessmodifers cs =new SampleAccessmodifers();
		//cs.display();
		//c1.privatemethod(); // not possible becoz its private so not visible in different class

	}

}
