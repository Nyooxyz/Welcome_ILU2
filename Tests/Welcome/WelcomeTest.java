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
	
	@Test
	void test_welcome_two() {
		assertEquals("Hello, Amy, Bob", welcoming.welcome("amy,bob"));
		assertEquals("Hello, Florian, Flavie", welcoming.welcome(" florian,flavie "));
	}
	
	@Test
	void test_welcome_plusieurs() {
		assertEquals("Hello, Amy, Bob, Jerry", welcoming.welcome("amy,bob,jerry"));
		assertEquals("Hello, Florian, Flavie, Flavien, Florence, Flo", welcoming.welcome(" florian,flavie,flavien,florence,flo "));
	}
	
	@Test
	void test_welcome_plusieurs_with_yell() {
		assertEquals("Hello, Amy, Jerry. AND HELLO, BOB !", welcoming.welcome("amy,BOB,jerry"));
		assertEquals("Hello, Flavie, Florence. AND HELLO, FLORIAN, FLAVIEN, FLO !", welcoming.welcome(" FLORIAN,flavie,FLAVIEN,florence,FLO "));
	}

}
