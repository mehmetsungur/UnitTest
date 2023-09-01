package Day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void testUpperCase(){
        String str1="a";
        String str2="b";
        String str3="c";

        assertEquals("a",str1.toUpperCase());
        assertEquals("b",str2.toUpperCase());
        assertEquals("c",str3.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {"a,A", "b,B","c,C"})
    void testUpperCase2(String str1, String str2){
        assertEquals(str2,str1.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {"true,java,a", "false,junit,b"})
    void testContains(boolean b, String str1, String str2){
        assertEquals(b,str1.contains(str2));
    }
}
