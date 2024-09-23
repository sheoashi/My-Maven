package exception;

public class NullPointerException {
	private String amy;
	public void display()
	{
		amy = null;
		int length = amy.length();
		System.out.println("Length of the string: " + length);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerException obj= new NullPointerException();
		obj.display();
	}

}
