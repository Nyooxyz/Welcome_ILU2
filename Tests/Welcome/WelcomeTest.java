package Welcome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	private Welcome welcoming;

	@BeforeEach
	void setUp() {
		welcoming = new Welcome();
	}

	@Test
	void test_welcome_bob() {
		assertEquals("Hello, Bob", welcoming.welcome("bob"));
	}

}
