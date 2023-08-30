package Day01;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_BeforeAfterEach {
    String str;

    @BeforeEach // Aşağıdaki method her bir test başlamadan önce çalışır.
    void BeforeEach(){
        str="JUnit Working";
    }

    @AfterEach // Aşağıdaki method her bir test bittikten sonra çalışır.
    void afterEach(){
        str=null;
        System.out.println("********** afterEach working!");
    }

    @Test
    void testSplit(TestInfo info){
        String[] realValue = str.split(" ");
        String[] waitValue = {"JUnit", "Working"};

        System.out.println(info.getDisplayName() + " working!");
        Assertions.assertArrayEquals(waitValue,realValue);
    }

    @Test
    void testLength(TestInfo info){
        System.out.println(info.getDisplayName() + " working!");
        assertEquals(13,str.length());
    }
}
