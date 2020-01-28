package junit;

import org.junit.*;
 
public class SimpleTest {
    @Test
    public void testSimpleClass() {
        SimpleClass s = new SimpleClass();
        Assert.assertEquals("hello, foo", s.getGreeting());
    }
}
class SimpleClass {
    public String getGreeting() {
        return "hello, world";
    }
}
