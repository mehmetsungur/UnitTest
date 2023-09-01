package Day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {
    @Test
    void testLength(){
        assertTrue("a".length()>0);
        assertTrue("b".length()>0);
        assertTrue("c".length()>0);
        assertTrue("d".length()>0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a","b","c","d"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }
}
