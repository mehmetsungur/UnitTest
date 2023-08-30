package Day01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Test03_BeforeAfterEach {
    String str;

    @BeforeEach
    void BeforeEach(){
        str="JUnit Working";
    }

    @AfterEach
    void afterEach(){
        str=null;
    }
}
