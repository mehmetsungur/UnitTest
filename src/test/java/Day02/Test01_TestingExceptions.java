package Day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {
    @Test
    void testExceptions(){
        String str = null;
        //str.length(); // Exceptions Status

        assertThrows(NullPointerException.class,()->{
           str.length();
        });
    }
}
