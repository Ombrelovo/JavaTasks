import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task4Test {
    @Test
    public void testWordsCount(){
        assertEquals(1, Task4.wordsCount("Pasha tratata.", "pasha"));
        assertEquals(1, Task4.wordsCount("Pasha tratata.", "Pasha"));
        assertEquals(1, Task4.wordsCount("pasha tratata.", "Pasha"));
        assertEquals(1, Task4.wordsCount("pasha tratata.", "pasha"));
        assertEquals(1, Task4.wordsCount("Pasha. tratata.", "pasha"));
        assertEquals(1, Task4.wordsCount("pasha! tratata.", "pasha"));
        assertEquals(1, Task4.wordsCount("Pasha@ tratata.", "Pasha"));
        assertEquals(1, Task4.wordsCount("pasha        tratata.", "Pasha"));
        assertEquals(0, Task4.wordsCount("Pa.sha@ tratata.", "Pasha"));
    }

}
