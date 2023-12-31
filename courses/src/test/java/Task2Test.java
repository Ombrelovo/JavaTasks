import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class Task2Test {
    @Test
    public void testIsZero(){
        assertTrue(Task2.isItZero(0,0));
        assertTrue(Task2.isItZero(-0,1));
        assertFalse(Task2.isItZero(3,1));
    }
    @Test
    public void testIsNegative(){
        assertTrue(Task2.isItNegative(0,-1));
        assertTrue(Task2.isItNegative(-0,-1));
        assertFalse(Task2.isItNegative(3,1));
    }
    @Test
    public void testFindingGCD(){
        assertEquals(1, Task2.findingGCD(15,7));
    }
    @Test
    public void testFindingLCM(){
        assertEquals(105, Task2.findingLCM(15,7));
    }

}
