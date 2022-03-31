package abstractionInJava;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s= new Student();
		NewStudent nt= new NewStudent();
		nt.addStudent();
		nt.edit();
	}
}
abstract class Student{	
	Student(){
		System.out.println("this is student class");
	}
	
	void addStudent() {
		System.out.println("enter Student name:");
		System.out.println("enter Student rollNumber:");
		System.out.println("enter Student address:");
	}
	abstract void edit();
}
class NewStudent extends Student{
	void edit() {
	System.out.println("added new address");	
	}
}