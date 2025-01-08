import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostfixConverterTest {
    @Test
    public void testInfixToPostfix1() {
        assertEquals("AB+C*", PostfixConverter.infixToPostfix("(,A,+,B,),*,C,"));
    }

    @Test
    public void testInfixToPostfix2() {
        assertEquals("6515*+", PostfixConverter.infixToPostfix("6,+,5,*,15"));
    }

    @Test
    public void testInfixToPostfix3() {
        assertEquals("ABC*+D-", PostfixConverter.infixToPostfix("A,+,B,*,C,-,D"));
    }
}
