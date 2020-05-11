import org.testng.annotations.Test;


public class TestExceptiontimeout {
	
	/*@Test(invocationTimeOut=2)
	public void infiniteLooptest(){
		
		int i=1;
		while(i==1){
			System.out.println(i);
		}
	}
	*/
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1(){
		String x="180A";
		Integer.parseInt(x);
		
	}
	

}
