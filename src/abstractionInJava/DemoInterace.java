package abstractionInJava;

public class DemoInterace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s= new SBI();
		s.getPIROI();
		s.getHomeLoanROI();
		s.getLoanStatus();

	}

}


interface RBI{
	public abstract void getPIROI();
	void getHomeLoanROI();
	void getLoanStatus();
}

class HDFC implements RBI{
	int roiHDFC=10;
	int homeloanROI=7;
	@Override
	public void getPIROI() {
		System.out.println("welcome to HDFC bank PI department ");
		System.out.println(" personal loan roi is "+roiHDFC);
	}

	@Override
	public void getHomeLoanROI() {
		// TODO Auto-generated method stub
		System.out.println("welcome to HDFC bank home loan department ");
		System.out.println(" personal loan roi is "+homeloanROI);
	}

	@Override
	public void getLoanStatus() {
		// TODO Auto-generated method stub
		System.out.println("in proress");
		
	}
	
}


class SBI implements RBI{
     int sbiPIROI=11;
     int sbHomeLoanPI=6;
	@Override
	public void getPIROI() {
		// TODO Auto-generated method stub
		System.out.println("welcome to SBI bank PI department ");
		System.out.println(" personal loan roi is "+sbiPIROI);	
	}

	@Override
	public void getHomeLoanROI() {
		// TODO Auto-generated method stub
		System.out.println("welcome to HDFC bank home loan department ");
		System.out.println(" personal loan roi is "+sbHomeLoanPI);	
	}

	@Override
	public void getLoanStatus() {
		// TODO Auto-generated method stub
		System.out.println("in proress");
	}
	
}
