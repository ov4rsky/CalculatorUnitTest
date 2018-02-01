import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		
		assertEquals(cal.add(20,10),30);
	}
	
	@Test
	public void testMinus() {
		Calculator cal = new Calculator();
		assertEquals(cal.minus(30,10),20);
	
	}
	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		assertEquals(cal.multiply(10,10),100);
	}

}
