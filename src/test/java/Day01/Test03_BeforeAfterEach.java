package Day01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_BeforeAfterEach {
    String str;

    @BeforeEach
    void BeforeEach(){
        str="JUnit Working";
    }

    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("********** afterEach working!");
    }

    @Test
    void testSplit(){
        String[] realValue = str.split(" ");
        String[] waitValue = {"JUnit", "Working"};

        Assertions.assertArrayEquals(waitValue,realValue);
    }

    @Test
    void testLength(){
        assertEquals(13,str.length());
    }
}
