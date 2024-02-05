import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestClassTest {

	@Test
	public void testAdd() {
		UnitTestClass addition = new UnitTestClass();
		int result = addition.add(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testSquare() {
		UnitTestClass square = new UnitTestClass();
		int answer = square.square(4);
		assertEquals(16, answer);
	}
	
}
