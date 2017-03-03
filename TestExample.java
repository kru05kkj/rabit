package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class testExample {
	


	@Test
	public void getMinMaxStringTest() {
		Example exam = new Example();
		
		assertEquals("1 4", exam.getMinMaxString("1 2 3 4"));
		assertEquals("-4 3", exam.getMinMaxString("-1 2 3 -4"));
		assertEquals("0 9", exam.getMinMaxString("0 2 3 6 7 8 9"));
		assertEquals("-1 0", exam.getMinMaxString("0 -1"));
		assertEquals("-1 -1", exam.getMinMaxString("-1"));
		//fail("Not yet implemented");

	}
	
	@Test
	public void evenOrOddTest() {
		Example exam = new Example();
		assertEquals("Odd", exam.evenOrOdd(1));
		assertEquals("Even", exam.evenOrOdd(2));
		assertEquals("Even", exam.evenOrOdd(0));
	}
	
	@Test
	public void getStrToIntTest(){
		Example exam = new Example();
		assertEquals(1234, exam.getStrToInt("1234"));
		assertEquals(-1234, exam.getStrToInt("-1234"));
	}
	
	@Test
	public void waterMelonTest(){
		Example exam = new Example();
		assertEquals("수박수", exam.waterMelon(3));
		assertEquals("수박수박", exam.waterMelon(4));
		assertEquals("", exam.waterMelon(0));
	}
	
	@Test
	public void findKimTest() {
		Example exam = new Example();
		String[] names = {"Queen", "Tod","Kim"};
		assertEquals("김서방은 2에 있다", exam.findKimTest(names));
		String[] names2 =  {"","Queen", "Tod","Kim"};
		assertEquals("김서방은 3에 있다", exam.findKimTest(names2));
	}
	
	@Test
	public void printTriangle(){
		Example exam = new Example();
		assertEquals("*\n**\n***\n", exam.printTriangle(3));
		assertEquals("*\n**\n***\n****\n", exam.printTriangle(4));
		assertEquals("*\n", exam.printTriangle(1));
		assertEquals("", exam.printTriangle(0));
		
	}
	
	@Test
	public void reverseStrTest(){
		Example exam = new Example();
		assertEquals("dcba", exam.reverseStr("dbca"));
		assertEquals("fed21", exam.reverseStr("12edf"));
		assertEquals("zuokeebYTRLJHDB", exam.reverseStr("BDHJLRTYbeekouz"));
	}
	
	@Test
	public void divisibleTest(){
		Example exam = new Example();
		int[] array = {5, 9, 7, 10};
		int[] expected = {5, 10};
		assertArrayEquals(expected, exam.divisible(array, 5));
	}
	
	@Test
	public void getMiddleTest(){
		Example exam = new Example();
		assertEquals("w", exam.getMiddle("power"));
		assertEquals("es", exam.getMiddle("test"));
	}
	
	
	@Test
	public void gcdlcmTest(){
		Example exam = new Example();
		int[] expected = {3, 12};
		assertArrayEquals(expected, exam.gcdlcm(3, 12));
		int[] expected1 = {1, 6};
		assertArrayEquals(expected1, exam.gcdlcm(2, 3));
		int[] expected2 = {1, 12};
		assertArrayEquals(expected2, exam.gcdlcm(1, 12));
		
	}
	
	@Test
	public void fibonacciTest(){
		Example exam = new Example();
		assertEquals(2, exam.fibonacci(3));
		assertEquals(3, exam.fibonacci(4));
		assertEquals(5, exam.fibonacci(5));
		assertEquals(53316291173L, exam.fibonacci(53));
	}
	
	@Test
	public void getMinSumTest() {
		Example exam = new Example();
		int[] param11 = {1,2};
		int[] param12 = {3,4};
		assertEquals(10, exam.getMinSum(param11, param12));
	}
}
