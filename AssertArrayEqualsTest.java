package Assert;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertArrayEqualsTest {

	@Test
	public void test()
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		assertArrayEquals(arr1,arr2);
	}

}
