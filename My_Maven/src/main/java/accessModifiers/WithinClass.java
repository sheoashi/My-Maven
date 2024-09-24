package accessModifiers;

public class WithinClass 
{
	public void print1()
	{
		System.out.println("public method"); // within the class access modifers
		}
	
	private void privatemethod() 
	{
		System.out.println("private method");
	}
	public static void main(String[] args) 
	{
		
		
		// TODO Auto-generated method stub
		WithinClass obj = new WithinClass();
		obj.print1();
		obj.privatemethod();
		
	}

}
