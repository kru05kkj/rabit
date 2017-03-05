package com.algorithm.tryhelloworld;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloworldTest extends TestCase {

	@Test
	public void testgetMinMaxStringTest() {
		Example exam = new Example();
		
		assertEquals("1 4", exam.getMinMaxString("1 2 3 4"));
		assertEquals("-4 3", exam.getMinMaxString("-1 2 3 -4"));
		assertEquals("0 9", exam.getMinMaxString("0 2 3 6 7 8 9"));
		assertEquals("-1 0", exam.getMinMaxString("0 -1"));
		assertEquals("-1 -1", exam.getMinMaxString("-1"));
		//fail("Not yet implemented");

	}
	
	@Test
	public void testevenOrOddTest() {
		Example exam = new Example();
		assertEquals("Odd", exam.evenOrOdd(1));
		assertEquals("Even", exam.evenOrOdd(2));
		assertEquals("Even", exam.evenOrOdd(0));
	}
	
	@Test
	public void testgetStrToIntTest(){
		Example exam = new Example();
		assertEquals(1234, exam.getStrToInt("1234"));
		assertEquals(-1234, exam.getStrToInt("-1234"));
	}
	
	@Test
	public void testwaterMelonTest(){
		Example exam = new Example();
		assertEquals("수박수", exam.waterMelon(3));
		assertEquals("수박수박", exam.waterMelon(4));
		assertEquals("", exam.waterMelon(0));
	}
	
	@Test
	public void testfindKimTest() {
		Example exam = new Example();
		String[] names = {"Queen", "Tod","Kim"};
		assertEquals("김서방은 2에 있다", exam.findKimTest(names));
		String[] names2 =  {"","Queen", "Tod","Kim"};
		assertEquals("김서방은 3에 있다", exam.findKimTest(names2));
	}
	
	@Test
	public void testprintTriangle(){
		Example exam = new Example();
		assertEquals("*\n**\n***\n", exam.printTriangle(3));
		assertEquals("*\n**\n***\n****\n", exam.printTriangle(4));
		assertEquals("*\n", exam.printTriangle(1));
		assertEquals("", exam.printTriangle(0));
		
	}
	
	@Test
	public void testreverseStrTest(){
		Example exam = new Example();
		assertEquals("dcba", exam.reverseStr("dbca"));
		assertEquals("fed21", exam.reverseStr("12edf"));
		assertEquals("zuokeebYTRLJHDB", exam.reverseStr("BDHJLRTYbeekouz"));
	}
	
	@Test
	public void testdivisibleTest(){
		Example exam = new Example();
		int[] array = {5, 9, 7, 10};
		int[] expected = {5, 10};
		assertArrayEquals(expected, exam.divisible(array, 5));
	}
	
	@Test
	public void testgetMiddleTest(){
		Example exam = new Example();
		assertEquals("w", exam.getMiddle("power"));
		assertEquals("es", exam.getMiddle("test"));
	}
	
	
	@Test
	public void testgcdlcmTest(){
		Example exam = new Example();
		int[] expected = {3, 12};
		assertArrayEquals(expected, exam.gcdlcm(3, 12));
		int[] expected1 = {1, 6};
		assertArrayEquals(expected1, exam.gcdlcm(2, 3));
		int[] expected2 = {1, 12};
		assertArrayEquals(expected2, exam.gcdlcm(1, 12));
		
	}
	
	@Test
	public void testfibonacciTest(){
		Example exam = new Example();
		assertEquals(2, exam.fibonacci(3));
		assertEquals(3, exam.fibonacci(4));
		assertEquals(5, exam.fibonacci(5));
		assertEquals(53316291173L, exam.fibonacci(53));
	}
	
	@Test
	public void testgetMinSumTest() {
		Example exam = new Example();
		int[] param11 = {1,2};
		int[] param12 = {3,4};
		assertEquals(10, exam.getMinSum(param11, param12));
	}
	
	@Test
	public void testjumpCase() {
		Example exam = new Example();
		assertEquals(5, exam.jumpCase(4));
		assertEquals(3, exam.jumpCase(3));
		assertEquals(2, exam.jumpCase(2));
		assertEquals(1, exam.jumpCase(1));
		assertEquals(8, exam.jumpCase(5));
	}
	
	@Test
	public void testnumberOfPrime(){
		Example exam = new Example();
		assertEquals(4, exam.numberOfPrime(10));
		assertEquals(3, exam.numberOfPrime(5));
		assertEquals(6, exam.numberOfPrime(15));
		assertEquals(10, exam.numberOfPrime(30));
		assertEquals(11, exam.numberOfPrime(31));
		assertEquals(2262, exam.numberOfPrime(20000));
		assertEquals(25, exam.numberOfPrime(100));
		assertEquals(0, exam.numberOfPrime(0));
		assertEquals(0, exam.numberOfPrime(1));
		assertEquals(1, exam.numberOfPrime(2));
	}
	
	@Test
	public void testgetCoreNumber(){
		Example exam = new Example();
		int[] core = {1, 2, 3};
		assertEquals(2, exam.getCoreNumber(6, core));
	}
}
