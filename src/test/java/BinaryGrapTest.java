import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryGrapTest {

    private BinaryGrap binaryGrap;

    @Before
    public void setUp() throws Exception {
        binaryGrap = new BinaryGrap ( );
    }

    @Test
    public void should_return_0_in_case_of_0() {
        Assert.assertEquals (0, binaryGrap.calculateGap (0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_raise_exception_when_negative_number() {
        binaryGrap.calculateGap (-1);
    }
    @Test
    public void should_return_1_in_case_of_5() {
        Assert.assertEquals (1, binaryGrap.calculateGap (5));
    }
}
