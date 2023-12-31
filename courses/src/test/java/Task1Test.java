
import org.junit.Test;

import java.util.stream.IntStream;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;



public class Task1Test {
    @Test
    public void testIsPrime(){
        assertTrue(Task1.isPrime(3));
    }

    @Test
    public void testIsEven(){
        assertTrue(Task1.isEven(4));
        assertFalse(Task1.isEven(3));
        assertTrue(Task1.isEven(0));
        assertTrue(Task1.isEven(-10));

        IntStream.range(0,1000).filter(i-> i% 2 == 0).forEach(i->assertTrue(Task1.isEven(i)));
        IntStream.range(0,1000).filter(i-> i% 2 != 0).forEach(i->assertFalse(Task1.isEven(i)));
    }
    @Test
    public void testIsOne(){
        assertTrue(Task1.isOne(1));
        assertFalse(Task1.isOne(3));
    }
    @Test
    public void testIsZero(){
        assertTrue(Task1.isZero(0));
        assertFalse(Task1.isOne(3));
    }
}

