package exception;

public class SampleCustomException {
	public void test(int age) throws LicenseException
	{
		if (age<18)
		
		{
			 throw new LicenseException("Not eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote");		}
	}
	public static void main(String[] args) throws LicenseException{

		SampleCustomException sc =new SampleCustomException();
		sc.test(24);

	}

}
 