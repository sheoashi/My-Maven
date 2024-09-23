package exception;

public class ExceptionHandling1 {
	public void display()
	{
		try
		{
		int a=10;
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
			System.out.println(e);
			}
		/*finally
		{
			System.out.println("finally block");
		}*/
		}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ExceptionHandling1 obj= new ExceptionHandling1();
		System.out.println("end of statement");
		obj.display();
		}
}

