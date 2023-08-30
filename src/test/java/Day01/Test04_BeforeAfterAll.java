package Day01;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test04_BeforeAfterAll {
    @BeforeAll
    static void openFile(){
        System.out.println("open a file");
    }

    @AfterAll
    static void closeFile(){
        System.out.println("close file");
    }

    @Test
    void testSplitWithArrays(TestInfo info){
        String str="JUnit Working";
        String[] realValue = str.split(" ");
        String[] waitValue = {"JUnit", "Working"};

        System.out.println(info.getDisplayName() + " working!");
        Assertions.assertArrayEquals(waitValue,realValue);
    }
}
