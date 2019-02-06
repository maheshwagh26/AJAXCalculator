import static org.junit.Assert.*;

import org.junit.Test;

import com.mahesh.Calculator;

public class CalculatorTest {

	Calculator cal=new Calculator();
	 @Test	
		public void addTest() {
		
			assertEquals(11,cal.addFunction(6, 5));
		}
	 @Test
		public void substractTest() {
			
			assertEquals(6, cal.substractFunction(9, 3));
		}
	 @Test
		public void multiplyTest() {
			
			assertEquals(28,cal.multiplyFunction(4, 7));
		}
	 @Test
		public void divideTest() {
			
			assertEquals(2,cal.divideFunction(6, 3));
		}

}
