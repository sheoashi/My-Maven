package assignments;

public abstract class StudentAbstract {
	// Instance variables
	String name;   
	int age;
	String grade;
	public StudentAbstract(String name,int age, String grade) //Constructor
	{ 
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public abstract void display();  // abstract method
	public static void totalStudents(int count) //static method
	{
		System.out.println("total students added:" +count);
	}
}
