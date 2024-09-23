package Inheritance;

public class HierarchicalChild1 extends HierarchicalParent {
	public void sub()
	{
		c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild1 ch=new HierarchicalChild1();
		ch.sum();
		ch.sub();
	}

}
