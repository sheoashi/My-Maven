package Inheritance;

public class HierarchicalChild2 extends HierarchicalParent {
	public void multi()
	{
		c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild2 cd=new HierarchicalChild2();
		cd.multi();
		cd.sum();
		System.out.println(cd.a);
		System.out.println(cd.b);
		
	}

}
