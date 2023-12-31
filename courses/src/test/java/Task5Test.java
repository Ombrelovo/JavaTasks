import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task5Test {
@Test
public void testFoundNum(){
    assertEquals(Arrays.toString(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22}), Arrays.toString(Task5.foundNum(23)));
}

}
