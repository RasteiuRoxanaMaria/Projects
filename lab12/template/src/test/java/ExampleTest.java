import org.junit.Test;
import ro.utcluj.aut.isp.template.Example;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class ExampleTest {

    @Test
    public void testAdd(){
        assertEquals("Should add 2 numbers", 30, Example.add(10,20));
    }
}
