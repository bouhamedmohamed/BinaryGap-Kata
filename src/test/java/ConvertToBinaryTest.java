import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConvertToBinaryTest {

    private BinaryGrap binaryGrap;

    @Before
    public void setUp() throws Exception {
        binaryGrap = new BinaryGrap ( );
    }

    @Test
    public void should_return_0_when_0() {
        Assert.assertEquals ("0", binaryGrap.convertToBinaryNumber (0));
    }

    @Test
    public void should_return_1_when_1() {
        Assert.assertEquals ("1", binaryGrap.convertToBinaryNumber (1));
    }

    @Test
    public void should_return_101_1001_when_5_and_9() {
        Assert.assertEquals ("101", binaryGrap.convertToBinaryNumber (5));
        Assert.assertEquals ("1001", binaryGrap.convertToBinaryNumber (9));
    }
}
