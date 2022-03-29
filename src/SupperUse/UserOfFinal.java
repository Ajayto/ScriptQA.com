package SupperUse;

public class UserOfFinal {
	 final int a;
	 UserOfFinal(){a=30;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserOfFinal f= new UserOfFinal();
	
		

	}

}

final class AA{
	 void show() {
		System.out.println("This is class AA show method");
	}
}

class BB extends AA{
	void show() {
		System.out.println("this is class be BB  show method");
	}
}
