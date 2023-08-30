package Day01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(waitValue,realValue);
    }
}
