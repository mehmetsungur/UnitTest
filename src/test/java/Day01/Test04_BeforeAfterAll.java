package Day01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test04_BeforeAfterAll {
    @BeforeAll
    static void openFile(){
        System.out.println("open a file");
    }

    @AfterAll

}
