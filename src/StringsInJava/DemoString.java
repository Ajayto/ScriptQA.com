package StringsInJava;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String s="Hello java welcome";
	 StringBuffer sb = new StringBuffer("Hello java welcome");
	 StringBuilder sb3=new StringBuilder("svvdsvv");
	 
     // StringBuffer sb1="svdvdsv";
	 System.out.println("new string="+s.concat("to java class"));
	 System.out.println(s);
	 sb.append("to java class");
	 System.out.println("String s="+s);
	 System.out.println("SB="+sb);
	 
	 String s1= new String();
	 String s2= new String("Hello java");
	 String s3= new String(sb);
	 String s4= new String(sb3);
	 String s10= new String("ScriptQA");
	 
	 char ch[]= {'a','b','c','d'};
	 String s5= new String(ch);
	 System.out.println("s5="+s5);
	 
	 byte b[]= {65,67,68,69};
	 String s6= new String(b);
	 System.out.println("S6="+s6);
	 
//	 }

	}

}
