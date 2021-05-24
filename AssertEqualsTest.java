package Assert;

//import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AssertEqualsTest {

	@Test
	public void test()
	{
//		Assert.fail("Not yet implemented");
//		fail("Not yet implmented");
		
		
//		assertEquals(5,7);
//		assertEquals("hai","hello"); // like .equals() method
//		assertEquals(true,true);	
//		assertEquals(5.568,5.011,1); // for double and float, we have to give delta(expected, actual, delta)
	
		//expected : 5.7896
		// actual : 5.7
		
//		assertEquals(5.7896,5.7,0.1);
		
		// 5.7896 - 5.7 = 0.0896
		// delta = 0.1
		//Math.abs(expected - actual) <= delta
		
		String str1 = new String("hai");
		String str2 = new String("hai");
		assertEquals(str1,str2); // str.equals(str1) str == str1
	}
}
