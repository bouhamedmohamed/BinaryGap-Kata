import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConvertToBinaryTest {

    private BinaryGap binaryGap;

    @Before
    public void setUp() throws Exception {
        binaryGap = new BinaryGap ( );
    }

    @Test
    public void should_return_0_when_0() {
        Assert.assertEquals ("0", binaryGap.convertToBinaryNumber (0));
    }

    @Test
    public void should_return_1_when_1() {
        Assert.assertEquals ("1", binaryGap.convertToBinaryNumber (1));
    }

    @Test
    public void should_return_101_1001_when_5_and_9() {
        Assert.assertEquals ("101", binaryGap.convertToBinaryNumber (5));
        Assert.assertEquals ("1001", binaryGap.convertToBinaryNumber (9));
    }
}
