package OOP;

public class LoginPage {
	void forgotPassword() {
		System.out.println("Click for forgotPassword");
	}	
	void forgotUserName() {
		System.out.println("Click for user name");
	}
	void login() {
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		System.out.println("Click on submit button");
	}
}

class loginWithMobile extends LoginPage{
	void login() {
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		System.out.println("Enter mobile number");
		System.out.println("Click on submit button");
	}
}
