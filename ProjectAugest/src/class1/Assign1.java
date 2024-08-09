package class1;

public class Assign1 {

	int rollno;
	int age;
	public void Display1() 
	{
		System.out.println("Welcome to all of you");
	}
	
	public void Display2() {
		System.out.println("Automation is easy");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign1 obj=new Assign1();
		obj.rollno=123;
		System.out.println("The Rollno is " + obj.rollno);
		obj.age=23;
		System.out.println("The Age is " + obj.age);
		obj.Display1();
		obj.Display2();

	}

}
