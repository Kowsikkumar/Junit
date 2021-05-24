package BasicAnnotaion;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_AfterClass {

	@BeforeClass
	public static void setup()
	{
		System.out.println("Using @BeforeClass, setup() is excuted before execution of any test method");
	}
	
	@AfterClass
	public static void teardown()
	{
		System.out.println("Using @AfterClass, teardown() is executed after execution of every test method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test method 1 is executed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test method 2 is executed");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test method 3 is executed");
	}
}
