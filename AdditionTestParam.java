package main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AdditionTestParam {

//	@Test
//	public void testMethod()
//	{
//		int expected = 10;
//		int actual = Arithmatic.add(5, 5);
//		
//		Arithmatic obj = new Arithmatic();
//		int actual = obj.multiply(5,3); 
//		assertEquals(expected,actual);
//	}
//	
	private int expected;
	private int firstNumber;
	private int secondNumber;
	
	public AdditionTestParam(int first, int second, int expected)
	{
		this.firstNumber = first;
		this.secondNumber = second;
		this.expected = expected;
	}
//	
	@Parameters
	public static Collection<Integer[]> input()
	{
//		Integer[][] inputsMul = {{2,4,8},{6,8,48},{5,12,60},{53,23,1219},{12,12,144}};
//		return Arrays.asList(inputsMul);
		Integer[][] inputsAdd = {{2,4,6},{6,8,14},{5,12,17},{53,23,76},{12,12,24}};
		return Arrays.asList(inputsAdd);
	}
	
	@Test
	public void testAddition()
	{
//		System.out.println("Sum of "+firstNumber+ " and " + secondNumber +" : " + expected);
		assertEquals(expected,Arithmatic.add(firstNumber, secondNumber));
	}
////	
//	@Test
//	public void testMultiply()
//	{
////		System.out.println("Multiply of "+firstNumber+ " and " + secondNumber +" : " + expected);
//		Arithmatic obj = new Arithmatic(); 
//		assertEquals(expected,obj.multiply(firstNumber, secondNumber));
//	}
	
}
