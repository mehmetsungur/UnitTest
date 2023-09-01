package Day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test02_DisplayName {
    @Test
    @DisplayName("Test parseInt() to check does throw NumberFormatException when non digit value is given")
    void testParseIntWhenNondigitValue(TestInfo info){
        String str = "Merhaba"; //123
        String str2 = "123"; //123

        //Integer.parseInt(str); // return 123
        //System.out.println(Integer.parseInt(str));

        System.out.println(info.getDisplayName());

        assertThrows(NumberFormatException.class,()->{
           Integer.parseInt(str);
        },"Number format exception");
    }
}
