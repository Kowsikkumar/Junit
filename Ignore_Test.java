package BasicAnnotaion;

import org.junit.Ignore;
import org.junit.Test;

public class Ignore_Test {

	@Test
	public void test1()
	{
		System.out.println("Test1 is executed");
	}
	
	@Ignore("This method has some bug")
	@Test
	public void test2()
	{
		System.out.println("Test2 is executed");
	}
}
