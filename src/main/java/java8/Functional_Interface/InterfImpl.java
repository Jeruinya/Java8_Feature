package java8.Functional_Interface;

public class InterfImpl implements interf, Interf1 {
	
	public void m1(){
		interf.super.m1();
		Interf1.super.m1();
	}
	
	public static void main(String args[]){
		InterfImpl impl = new InterfImpl();
		impl.m1();
		
		
	}

}
