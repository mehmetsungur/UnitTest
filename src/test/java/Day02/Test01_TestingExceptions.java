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

    @Test
    void testExceptions2(){
        int sayi1=6;
        int sayi2=0;

        // System.out.println(sayi1/sayi2);
        assertThrows(ArithmeticException.class,()->{
            System.out.println(sayi1/sayi2);
        });
    }

    private int divide(int x, int y){
        //1 bölme işlemi: 6/3=2
        //2 AritmetikExec: 6/0
        //3 6/3 != 4
        return x/y;
    }

    @Test
    void testExceptions3(){
        int sayi1=6;
        int sayi2=0;

        // System.out.println(sayi1/sayi2);
        assertThrows(ArithmeticException.class,()->{
            divide(sayi1,sayi2);
        });
    }
}
