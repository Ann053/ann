package yyy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JisuanTest {
	private Jisuan calculator=new Jisuan();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
		
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8,calculator.getResult());
		
	}

}
