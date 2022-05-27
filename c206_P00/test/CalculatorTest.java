import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	int a, b;
	Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
		
		a = 4321;
		b = 1234;
		cal = new Calculator();
		
	}
	
	@Test
	public void testAdd() {
		
		int actual = cal.add(a, b); 
		 
		int expected = 5555;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void testSub() {
		
		int actual = cal.subtract(a, b); 
		 
		int expected = 3087;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void testMul() {
		
		int actual = cal.multiple(a, b); 
		 
		int expected = 5332114;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void testDiv() {
		
		int actual = cal.divide(a, b); 
		 
		int expected = 3; //3.50162074554295;
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void testDivideWith0Denominator() {
		try {
			Calculator cal = new Calculator();
			cal.divide(a, b);
			fail("Expected an IllegalArgumentException to be thrown");
			
		} catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
			
		} catch(Throwable t) {
			assertEquals ("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}

	@After
	public void tearDown() throws Exception {
		
	}

}
