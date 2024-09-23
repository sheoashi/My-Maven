package Inheritance;

public class Multi_ChildClass extends Multi_ParentClass
{
	public void multi()
	{
		c=a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_ChildClass sb= new Multi_ChildClass();
		System.out.println(sb.a);
		System.out.println(sb.b);
		sb.sum();
		sb.sub();
		sb.multi();

	}

}
