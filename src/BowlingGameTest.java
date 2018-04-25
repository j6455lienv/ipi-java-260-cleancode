import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BowlingGameTest {

    private BowlingGame game;

    void rollMany(int n, int pins, BowlingGame g) {
        for (int i = 0; i < n; i++) g.roll(pins);
    }

    @Before
    public void setUp() {
        this.game = new BowlingGame();
    }

    @Test
    public void testZero() {
        rollMany(20, 0, game);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1, game);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() {
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollMany(17, 0, game);
        assertEquals(16, game.score());
    }

    @Test
    public void testOneStrike() {
        game.roll(10);
        game.roll(3);
        game.roll(4);
        rollMany(16, 0, game);
        assertEquals(24, game.score());
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10, game);
        assertEquals(300, game.score());
    }
}