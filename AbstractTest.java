
abstract class AbTest{
	
	public abstract void abMethod();
}

 class AbTest2 extends AbTest{

	@Override
	public void abMethod() {
		System.out.println("abMethod");
		
	}
	 
	 
}

interface ItTest{
	void itMethod();
}

class ItTest2 implements ItTest{

	@Override
	public void itMethod() {
	
		System.out.println("itMethod");
	}
	
}
public  class AbstractTest {

	
	
	public static void main(String[] args) {
		AbTest2 abTest2=new AbTest2();
		abTest2.abMethod();
		
		ItTest2 itTest=new ItTest2();
		itTest.itMethod();
	}
}
