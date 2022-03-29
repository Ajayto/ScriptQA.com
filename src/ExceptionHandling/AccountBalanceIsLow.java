package ExceptionHandling;

public class AccountBalanceIsLow extends RuntimeException {
	AccountBalanceIsLow(String msg){
		super(msg);
	}

}
