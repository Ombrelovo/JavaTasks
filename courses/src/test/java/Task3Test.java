import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class Task3Test {
    @Test
    public void testWordsCount(){
        assertEquals(2, Task3.wordCount("Pasha tratata"));
    }
    @Test
    public void testAllWords(){
        assertEquals(new String[]{"pasha", "tratata"}, Task3.allWords("pasha /tratata"));
    }
    @Test
    public void testSorting(){
        assertEquals(new String[]{"asha", "btratata"}, Task3.sorting("btratata /asha"));
    }
}
