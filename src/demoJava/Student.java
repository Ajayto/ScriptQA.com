package demoJava;

public class Student {
	String name;
	int rollNumber;
	String Address;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student tom=new Student("tom",1001,"Uk");
		tom.displayStudentInfo();
		System.out.println(tom.name);
		Student ajay= new Student("Ajay",1002,"Pune");
		ajay.displayStudentInfo();

	}
	
	Student(String name,int rollNumber,String Address){
		this.name=name;
		this.rollNumber=rollNumber;
		this.Address=Address;
	}
	
	
	void displayStudentInfo() {
		System.out.println("Name="+name);
		System.out.println("rollNumber="+rollNumber);
		System.out.println("Address="+Address);
		
	}

}
