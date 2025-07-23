import org.example.Functions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    @Test
    public void testFunctionsTreble(){
        assertEquals((Integer) 6, Functions.treble.apply(2));
    }
}
