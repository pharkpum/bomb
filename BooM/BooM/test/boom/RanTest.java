package boom;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RanTest {
    
    public RanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testRandombomb1() {
        Ran ran = new Ran();
        int a = ran.Randombomb();
        assert(a >= 1);
    }
    
    @Test
    public void testRandombomb2() {
        Ran ran = new Ran();
        int a = ran.Randombomb();
        assert(a <= 6);
    }
    
    @Test
    public void testRandomItem1() {
        Ran ran = new Ran();
        int a = ran.RandomItem();
        assert(a >= 1);
    }
    
    @Test
    public void testRandomItem2() {
        Ran ran = new Ran();
        int a = ran.RandomItem();
        assert(a <= 3);
    }
}
