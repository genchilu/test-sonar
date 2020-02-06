package test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MyTestTest {

    @Test
    public void testTest1(){
        MyTest myTest = new MyTest();
        myTest.test1();
        assertTrue(true);
    }
}
