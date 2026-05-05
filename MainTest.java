import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testAddNumbers() {
        assertEquals(8, Main.addNumbers(6, 2));
    }

    @Test
    void testZero() {
        assertEquals(5, Main.addNumbers(0, 5));
    }

    @Test
    void testNegative() {
        assertEquals(-2, Main.addNumbers(-1, -1));
    }
}