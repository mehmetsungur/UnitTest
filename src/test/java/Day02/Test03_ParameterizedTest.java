package Day02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {
    @Test
    void testLength(){
        assertTrue("a".length()>0);
        assertTrue("b".length()>0);
        assertTrue("c".length()>0);
        assertTrue("d".length()>0);
    }
}
