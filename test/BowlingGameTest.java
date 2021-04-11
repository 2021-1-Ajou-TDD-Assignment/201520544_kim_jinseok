import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class BowlingGameTest {
	private Game g;
	
	@Before
	public void setUp() {
		g = new Game();
	}
	@Test
	public void testGutterGame() {
		rollMany(20, 0);
		assertEquals(0,g.score());
	}
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++) {
			g.roll(pins);
		}
	}
	@Test
	public void testAllOnews() {
		rollMany(20, 1);
		assertEquals(20,g.score());
	}
}
