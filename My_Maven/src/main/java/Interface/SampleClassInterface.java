package Interface;

public class SampleClassInterface implements InterfaceSample1 {
	public void display()
	{
		System.out.println("abstract method one");
	}
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public void print()
	{
		System.out.println("method in class") ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClassInterface ss=new SampleClassInterface();

		ss.display();
		ss.print();
		ss.add();
		System.out.println(InterfaceSample1.a);
		System.out.println(InterfaceSample1.b);
		InterfaceSample1 sb= new SampleClassInterface();
		//sb.print();
		sb.add();
		sb.display();
		System.out.println(InterfaceSample1.a);
		System.out.println(InterfaceSample1.b);
		
	}

}
