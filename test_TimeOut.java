package BasicAnnotaion;

import org.junit.Test;

public class test_TimeOut {

	@Test(timeout = 1000) // the time will be in milliseconds
	public void test()
	{
//		while(true);
		for(int i=1;i<=1000000;i++)
			System.out.println(i + ".  Sample Timeout");
	}
}
