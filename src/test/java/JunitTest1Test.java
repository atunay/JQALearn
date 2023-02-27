import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitTest1Test {

    @Test
    public void getName() {
JunitTest1 junit = new JunitTest1("JNT");
assertEquals("JNT", junit.getName());
    }

    @org.testng.annotations.Test
    public void testTestGetName() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetName() {
    }
}