package exception;

public class ExceptionSample {
		public void display()
		{
			int a=10;
			int b=a/0;
			System.out.println(b);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample obj= new ExceptionSample();
		//System.out.println("end of statement");
		obj.display();
		System.out.println("end of statement");
	}

}
