package homework9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fmi.informatics.functional.Rock;

class RockTest {

	@Test
	void test() {
		Rock onEarth = new Rock();
		onEarth.drop(onEarth.height());
		Rock onMoon = new Rock();
	
		assertEquals(onEarth, onMoon);
		
	}

}
