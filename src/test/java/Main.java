import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {
    @Test
    public void testOne() {
        Assert.assertEquals("Hello", "Hello", "Strings should be equal");
    }

    @Test
    public void testTwo() {
        Assert.assertTrue(5 > 3, "5 should be greater than 3");
    }

    @Test
    public void testThree() {
        Assert.assertFalse(2 + 2 == 5, "2 + 2 should equal 4");
    }
}
