package assignments;

public class StudentDetails extends StudentAbstract 
{
	public StudentDetails(String name,int age,String grade)  // Constructor for SchoolStudent class
	{
	super(name,age,grade);  // Call the constructor of the abstract class
	}
	public void display() //abstract method implement
	{
		System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails student1= new StudentDetails("amy" ,14,"8th grade");
		StudentDetails student2= new StudentDetails("abin",12,"5th grade");
		 student1.display();
		 System.out.println();
		 student2.display();
		 
		  // Calling the static method
		 StudentAbstract.totalStudents(2); //For example, we've added 2 students so 2
	}

}
