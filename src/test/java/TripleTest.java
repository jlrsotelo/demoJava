import org.example.Functions;
import org.example.Triple;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleTest {
    @Test
    public void testTriple(){
        assertEquals((Integer) 6, new Triple().apply(2));
    }
}
