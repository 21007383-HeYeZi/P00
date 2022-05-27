import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AverageTest {
	
	int a, b, c, d, e;
	Average ave = new Average();

	@Before
	public void setUp() throws Exception {
		
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		e = 5;
		ave = new Average();
	}
	
	@Test
	public void testAverage() {

		int actual = ave.average(a, b, c, d, e); 
		 
		int expected = 3;
		assertEquals (expected, actual);
		
	}

	@After
	public void tearDown() throws Exception {
	}

}
