package demoJava;

public class SwitchCaseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =20;
		int b=30;
		int key=4;

		switch (key) {
		case 1: {
			int c=a+b;
			System.out.println(c);
			break;
		}
		case 2: {
			int c=a-b;
			System.out.println(c);
			break;
		}
		case 3: {
			int c=a*b;
			System.out.println(c);
			break;
		}

		case 4: {
			int c=a/b;
			System.out.println(c);
			break;
		}
		default:
			System.out.println("enter valid choice");
		}
	}

}
