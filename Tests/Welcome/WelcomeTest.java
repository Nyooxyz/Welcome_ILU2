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
	
	@Test
	void test_welcome_other_names() {
		assertEquals("Hello, Tom", welcoming.welcome("tom"));
		assertEquals("Hello, Jerry", welcoming.welcome("jerry"));
		assertEquals("Hello, Florian", welcoming.welcome("florian"));

	}
	
	@Test
	void test_welcome_blank() {
		assertEquals("Hello, my friend", welcoming.welcome("   "));
		assertEquals("Hello, my friend", welcoming.welcome(""));
		assertEquals("Hello, my friend", welcoming.welcome(null));
	}
	
	@Test
	void test_welcome_yell() {
		assertEquals("HELLO, JERRY !", welcoming.welcome("JERRY"));
		assertEquals("HELLO, FLORIAN !", welcoming.welcome(" FLORIAN  "));
	}

}
