package Day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test02_DisplayName {
    @Test
    void testException(){
        String str = "Merhaba";
        //System.out.println(Integer.parseInt(str));

        assertThrows(NumberFormatException.class,()->{
           Integer.parseInt(str);
        },"Number format exception");
    }
}
