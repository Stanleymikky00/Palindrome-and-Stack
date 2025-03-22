import org.example.CharStack;
import org.example.CharStackImpl;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CharStackTest {
	@Test
	void testCharStack() {
		CharStack cs = new CharStackImpl();

		// initially stack is supposed to be empty!
		assertEquals(0, cs.size(), "stack is empty.");

		// ...and throw a NoSuchElementException if we call pop on an empty stack
		assertThrows(NoSuchElementException.class, cs::pop, "pop() on empty stack throws NoSuchElementException.");

		// push some values
		char[] data = {'a', 'b', 'c'};
		for(char c : data) {
			cs.push(c);
		}

		// check size of stack
		assertEquals(3, cs.size(), "Stack has correct size after repeated push().");

		// pop values
		for (int i = data.length - 1; i >= 0; i--) {
			assertEquals(data[i], cs.pop(), "Stack pop() retrieves values in correct order.");
		}

		// The stack better be empty now...
		assertEquals(0, cs.size(), "Stack has correct size after repeated pop().");
	}
}