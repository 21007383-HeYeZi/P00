import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberevenTest {
	
	int a;
	Numbereven num = new Numbereven();

	@Before
	public void setUp() throws Exception {
		
		a = 8;
		num = new Numbereven();
		
	}
	
	@Test
	public void testNumEven() {
		
		boolean actual = num.isEven(a); 
		 
		boolean expected = true;
		assertEquals (expected, actual); 
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
}
