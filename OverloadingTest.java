class Test{
	
	void overload() {
		System.out.println("매개변수 x");
	}
	void overload(int a) {
		System.out.println("매개변수"+a);
	}
	void overload(int a,int b) {
		int sum=a+b;
		System.out.println("a+b="+sum);
	}
	
}



public class OverloadingTest {
	public static void main(String[] args) {
		
		Test t1= new Test();
		
		t1.overload();
		
		t1.overload(5);
		
		t1.overload(5,3);
		
	}
}
