package OOP;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SBI s= new SBI();
//		s.getROI(10);
		
//		RBI r= new SBI();
//		r.getROI(20);
		
		RBI r1=new RBI();
		r1.getROI(20);
		
		
//		HDFC h = new HDFC();
//		h.getROI(20);
		
		

	}

}
class RBI{
	float ROI=5.4f;
public	void getROI(int a) {
		System.out.println("RBI roi is "+ROI);
	}
}

class SBI extends RBI{
	float ROI=5.8f;
public	void getROI(int a) {
		System.out.println("SBI roi is "+ROI);
	}
}
class HDFC extends RBI{
	float ROI=6f;
public	void getROI(int a) {
		System.out.println("HDFC roi is "+ROI);
	}
}