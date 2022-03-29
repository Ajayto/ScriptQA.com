package ExceptionHandling;

public class Account {
	int balance =30000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a= new Account();
		a.withdrow(40000);

	}
	void withdrow(int ammont) {
		if(balance>ammont) {
			balance=balance-ammont;
			System.out.println("Tracation is done");
		}
		else {
			throw new AccountBalanceIsLow("your account balance is low");
		}
	}

}
