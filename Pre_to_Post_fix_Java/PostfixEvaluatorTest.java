import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostfixEvaluatorTest {
    @Test
    public void testEvaluate() {
        assertEquals(81, PostfixEvaluator.evaluate("6,5,15,*,+"));
    }

    @Test
    public void testEvaluate2() {
        assertEquals(4, PostfixEvaluator.evaluate("6,5,-,8,4,-,*,4,3,-,/"));
    }
}
