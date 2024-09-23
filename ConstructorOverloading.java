class ConstructorOverloading
{
public  ConstructorOverloading()
{
System.out.println("hello");
}
public ConstructorOverloading(int a, int b)
{
System.out.println(a);
System.out.println(b);
}
public ConstructorOverloading(int a, int b, int c)
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
public static void main(String args[])
{
ConstructorOverloading obj1=new ConstructorOverloading(10,20);
ConstructorOverloading obj2=new ConstructorOverloading(30,40,50);
ConstructorOverloading obj3=new ConstructorOverloading(); // de
}
}

