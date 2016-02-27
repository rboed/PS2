package base;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	private int testInt = 0;
	private MyInteger myTestInt = new MyInteger(testInt);
	@Test
	public final void testgetiValue(){
		testInt = -100;
		myTestInt.setiValue(testInt);
		assertEquals(myTestInt.getiValue(), testInt);
		testInt = 100;
		myTestInt.setiValue(testInt);
		assertEquals(myTestInt.getiValue(), testInt);
		testInt = 0;
		myTestInt.setiValue(testInt);
		assertEquals(myTestInt.getiValue(), testInt);
	}
	@Test
	public final void testsetiValue(){
		testInt = 95;
		myTestInt.setiValue(testInt);
		assertEquals(myTestInt.getiValue(), testInt);
		testInt = 0;
		myTestInt.setiValue(testInt);
		assertEquals(myTestInt.getiValue(), testInt);
	}
	 @Test
	 public final void testIsEvenInt() {
	 	testInt = 1;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isEven());
	 	testInt = 2;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isEven());
	 	testInt = 0;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isEven());
	 }
	 @Test
	 public final void testIsOddInt() {
	 	testInt = 2;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isOdd());
	 	testInt = 1;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isOdd());
	 	testInt = 3;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isOdd());
	 	testInt = 0;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isOdd());
	 	testInt = 75;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isOdd());
	 	testInt = 99;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isOdd());
	 }
	 @Test
	 public final void testIsPrimeInt() {
	 	testInt = 1;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isPrime());
	 	testInt = 2;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isPrime());
	 	testInt = 0;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isPrime());
	 	testInt = -4;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isPrime());
	 	testInt = -2;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isPrime());
	 	testInt = 163;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isPrime());
	 	testInt = 251;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isPrime());
	 	testInt = 349;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.isPrime());
	 	testInt = 466776445;
	 	myTestInt.setiValue(testInt);
	 	assertFalse(myTestInt.isPrime());
	 }
	 @Test
	 public final void testEqualsInt() {
	 	testInt = 1;
	 	myTestInt.setiValue(testInt);
	 	assertTrue(myTestInt.equals(1));
	 	assertFalse(myTestInt.equals(2));
	 	assertFalse(myTestInt.equals(0));
	 	assertFalse(myTestInt.equals(11));
	 	assertFalse(myTestInt.equals(99));
	 	assertFalse(myTestInt.equals(999));	
	 }
	 @Test
	 public final void testEqualsMyInteger() {
		testInt = 1;
	 	myTestInt.setiValue(testInt);
	 	MyInteger myInt2 = new MyInteger(1);
	 	MyInteger myInt3 = new MyInteger(99);
	 	assertTrue(myTestInt.equals(myInt2));
		assertFalse(myTestInt.equals(myInt3));
	 }
}
