package abstractExample;

public interface C extends B{
   void printData();
}
class D implements C{
	public void printData() {
		System.out.println("Print Data");
	}
    public void getData() {
    	System.out.println("get data");
    }
}
