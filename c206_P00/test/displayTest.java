import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class displayTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() {
		
		System.out.println("This is the testcase for display");
		String str1 = "Software Development Process";
		assertNull(str1);
	}

	@After
	public void tearDown() throws Exception {
	}

}
