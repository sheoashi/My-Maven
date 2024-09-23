package exception;

public class NullExceptionHandling2 {
	private String a;
	public void display()
	{
		try {

		a = null;
		int length = a.length();
		System.out.println("Length of the string: " + length);
		}
		catch(Exception c)
		{
			System.out.println("exception handled");
			System.out.println(c);
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullExceptionHandling2 obj= new NullExceptionHandling2();
		obj.display();
	}

}
