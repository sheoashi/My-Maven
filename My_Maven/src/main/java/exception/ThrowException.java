package exception;

public class ThrowException {
	public static void test(int age)
	{
		if (age<18)
		{
			//System.out.println("not eligible");
			throw new ArithmeticException("Not eligible"); //throw the exception to constructor
		}
			else
			{
				System.out.println("Eligible foe vote");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.test(16);
		System.out.println("Print"); // not execute becoz after exception occurs no statement is print
	}

}
