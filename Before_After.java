package BasicAnnotaion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_After {
	
//	@Before
//	public void setup1()
//	{
//		System.out.println("@Before2");
//	}
//	
	@After
	public void teardown()
	{
		System.out.println("Using @After, teardown method executed\n");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 method executed");
		
//		return 1;
	}
	
	@Before
	public void setup()
	{
		System.out.println("Using @Before1, setup method executed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 method executed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 method executed");
	}
//	
//	@Test
//	public void test4()
//	{
//		System.out.println("Test4 method executed");
//	}
//	
//	@Test
//	public void test5()
//	{
//		System.out.println("Test5 method executed");
//	}
//	
//	@Test
//	public void test6()
//	{
//		System.out.println("Test6 method executed");
//	}

}
