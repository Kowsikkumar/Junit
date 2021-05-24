package BasicAnnotaion;

import java.util.Arrays;

import org.junit.Test;

public class test_Expected {

//	@Test(expected = NullPointerException.class)
////	@Test
//	public void test()
//	{
//		int arr[] = {3,2,1};
//		Arrays.sort(arr);
//	}
	

	@Test(expected = Exception.class)
//	@Test
	public void test()
	{
		int[] arr = new int[1];
		arr[0] = 1;
		arr[10] = 2;
	}
	
}
