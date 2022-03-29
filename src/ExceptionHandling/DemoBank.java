package ExceptionHandling;

import javax.management.RuntimeErrorException;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b= new BankAccount();
		b.witdrow(60000);

	}

}


class BankAccount{
	int accountBalance=50000;
	void witdrow(int amount) {
		if(amount<accountBalance) {
			accountBalance=accountBalance-amount;
			System.out.println("current balance="+accountBalance);
		}
		else {
		   throw new MyException("Low account balance");
		}
		
	}
}
