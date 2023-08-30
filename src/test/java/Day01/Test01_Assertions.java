package Day01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Test01_Assertions {
    // Test methodların erişim tipi public olmak zorunda(JUnit4 ve Öncesi)
    // JUnit5 ile birlikte public yazmak zorunda değiliz.

    @Test // Bir methodun test metodu olduğunu ve junit tarafından çalıştırılabilir hale gelir.
    public void test(){

    }

    @Test
    public void testLength(){
        String str = "Unit Test";
        int realValue = str.length();
        int waitValue = 9;

        // İki değeri de karşılaştırır.
        // Eğer değerler aynı ise test geçer aksi halde kalır.
        assertEquals(waitValue,realValue, "Length methodu hatalı");
    }

    //String --> toUpperCase
    @Test
    public void testToUpperCase(){
        String str = "Unit Test";
        String realValue = str.toUpperCase();
        String waitValue = str;

        //assertEquals(realValue,waitValue, "ToUpperCase methodu hatalı");
        assertNotEquals(realValue,waitValue, "ToUpperCase methodu hatalı");
    }

    @Test
    public void testListContains(){
        List<Integer> list = Arrays.asList(1,2,3,4);

        assertTrue(list.contains(2));
        assertFalse(list.contains(21));
    }

    @Test
    public void testSplit(){
        String str = "Unit Test";
        String[] realValue=str.split(" ");
        String[] waitValue= {"Unit","Test"};

        assertTrue(Arrays.equals(waitValue,realValue));
    }
}
